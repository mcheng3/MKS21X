import java.util.*;
import java.text.*;

public class Crop{	
	private Date d;
	private Weather w;
	private int requiredN;
	private double requiredWater;
	private double area;

	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
	public Crop(String date, String state, String city, int requiredGDD, double requiredWater, int baseTemp, double area){
		
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
    	this.requiredWater = requiredWater;
    	this.area = area;
		w = new Weather(year, month, day, state, city, requiredGDD, baseTemp);
	}

	public String harvestDate(){
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DAY_OF_MONTH, w.daysForGDD());
		Date harvestDate = cal.getTime();
		String s = format.format(harvestDate);
		return "Harvest crop on " + s;
	}

	public String waterNeeded(){
		double inches;
		double volume;
		double precip = w.inchesPrecip();
		System.out.println(requiredWater);
		if(precip >= requiredWater) return "No irrigation needed";
		else inches = requiredWater - precip;
		volume = area * inches / 12.0 * 7.48052; 
		volume = Math.round (volume * 5) / 5;  
		NumberFormat formatter = new DecimalFormat("###");  
		String gallons = formatter.format(volume);  
		return "Irrigate with " + gallons + " gallons of water";
	}

	public void setN(int nitrogen){
 
	}

	public String requiredN(){
		return "placeholder";
	}



}
		
