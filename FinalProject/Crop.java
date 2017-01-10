import java.util.*;
import java.text.SimpleDateFormat;

public class Crop{	
	private Date d;
	private Weather w;
	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
	public Crop(String date, String state, String city, int requiredGDD, int requiredWater, int requiredN, int baseTemp){
		
		try {
			d = format.parse(date);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
    	int day = c.get(Calendar.DAY_OF_MONTH);
		w = new Weather(year, month, day, state, city, requiredGDD, baseTemp);
	}

	public String harvestDate(){
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DAY_OF_MONTH, w.daysForGDD());
		Date harvestDate = cal.getTime();
		String s = format.format(harvestDate);
		return s;
	}
}
		
