import java.net.*;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import org.json.*;

public class Weather{
	private JSONObject weatherJSON;
	private Calendar cal;
	private String state;
	private String city;

	public Weather(int year, int month, int day, String state, String city){
		this.city = city.replaceAll(" ", "_");
		this.state = state;
		month = month - 1;
		cal = new GregorianCalendar(year, month, day);
		weatherJSON = new JSONObject(getData(cal));



	}

	public String getData(Calendar calendar){
		Calendar calTemp = (Calendar) calendar.clone();
		Date startDate = calTemp.getTime();
		calTemp.add(Calendar.DAY_OF_MONTH, 12);
		Date endDate = calTemp.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMdd");
		String start = dateFormat.format(startDate);
		String end = dateFormat.format(endDate);
		String content = "";
		try{
			URL apiURL = new URL("http://api.wunderground.com/api/0eda91f94dd93a2c/planner_"+start+end+"/q/"+state+"/"+city+".json");
			URLConnection apiURLConnection = apiURL.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(apiURLConnection.getInputStream()));
			String inputLine;
			while ((inputLine = br.readLine()) != null)
			{
				content = content + inputLine + "\n";
			}
			br.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return content;
	}
	//http://api.wunderground.com/api/0eda91f94dd93a2c/planner_MMDDMMDD/q/CA/San_Francisco.json
	public int daysForGDD(int requiredGDD, int baseTemp){
		//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calTemp = (Calendar) cal.clone();

		JSONObject data = weatherJSON;
		int gddSum = 0;
		int days = 1;
		int highAvg = Integer.parseInt(data.getJSONObject("trip").getJSONObject("temp_high").getJSONObject("avg").getString("F"));
		int lowAvg = Integer.parseInt(data.getJSONObject("trip").getJSONObject("temp_low").getJSONObject("avg").getString("F"));
		while(gddSum < requiredGDD){
			if(days % 12 == 0){
				calTemp.add(Calendar.DAY_OF_MONTH, 12);
				data = new JSONObject(getData(calTemp));
				highAvg = Integer.parseInt(data.getJSONObject("trip").getJSONObject("temp_high").getJSONObject("avg").getString("F"));
				lowAvg = Integer.parseInt(data.getJSONObject("trip").getJSONObject("temp_low").getJSONObject("avg").getString("F"));
			}
			
			gddSum += (highAvg + lowAvg) / 2 - baseTemp;
					Date time = calTemp.getTime();
			//System.out.println(dateFormat.format(time));
			//System.out.println(gddSum);
			days++;
		}
		return days; 
	}

	public static int daysForPreciptation(){
		return 0;
	}

	public static void main(String[] args){
		Weather okc = new Weather(2016, 4, 9, "OK", "Oklahoma City");
		System.out.println(okc.daysForGDD(2000, 50));
		System.out.println();
		System.out.println(okc.daysForGDD(2000, 50));
	}
}

