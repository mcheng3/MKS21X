import java.net.*;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
public class Weather{
	//http://api.wunderground.com/api/0eda91f94dd93a2c/planner_MMDDMMDD/q/CA/San_Francisco.json
	public static int averageWeeklyGDD(int year, int month, int day, int requiredGDD, String state, String city){
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
		System.out.println(content);
		return Integer.parseInt(content.substring(content.indexOf("\"avg\":") + 17, content.indexOf("\"avg\":") + 19));



	}


	public static void main(String[] args){
		System.out.println(Weather.averageWeeklyGDD(2016, 2, 1, 293, "NY", "New York"));
	}
}

