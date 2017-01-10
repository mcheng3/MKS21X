import java.net.*;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import org.json.*;

public class Locale{
	private JSONObject weatherJSON;
	private Calendar cal;
	private String state;
	private String city;

	public Locale(int year, int month, int day, String state, String city){
		this.city = city.replaceAll(" ", "_");
		this.state = state;
		month = month - 1;
		cal = new GregorianCalendar(year, month, day);
		weatherJSON = new JSONObject(getData());

	}

	public String getData(){
		Date startDate = cal.getTime();
		cal.add(Calendar.DAY_OF_MONTH, 7);
		Date endDate = cal.getTime();
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
	public String daysForGDD(int requiredGDD){
		int gddSum = 0;
		return weatherJSON.getJSONObject("trip").getJSONObject("temp_high").getJSONObject("avg").getString("F"); 
	}

	public static int daysForPreciptation(){
		return 0;
	}

	public static void main(String[] args){
		Locale nyc = new Locale(2016, 5, 9, "NY", "New York");
		System.out.println(nyc.daysForGDD(2000));
	}
}

