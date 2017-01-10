import java.net.*;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
public class Locale{
	private String weatherJSON;

	public Locale(int year, int month, int day, String state, String city){
		int gddSum = 0;
		city = city.replaceAll(" ", "_");
		month = month - 1;
		Calendar cal = new GregorianCalendar(year, month, day);
		Date startDate = cal.getTime();
		cal.add(Calendar.DAY_OF_MONTH, 7);
		Date endDate = cal.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMdd");
		String start = dateFormat.format(startDate);
		String end = dateFormat.format(endDate);
		String  content = "";
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
		weatherJSON = content;

	}
	//http://api.wunderground.com/api/0eda91f94dd93a2c/planner_MMDDMMDD/q/CA/San_Francisco.json
	public static int daysForGDD(){

		return 0; 
	}

	public static int daysForPreciptation(){
		return 0;
	}

	public static void main(String[] args){
		Locale nyc = new Locale(2016, 5, 9, "NY", "New York");
	}
}

