import java.util.*;
import java.text.*;

public class Crop{	
	private Date d;
	private Weather w;
	private int requiredN;
	private double requiredWater;
	private double area;
	private double amountN;
	private double n;

	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
	public Crop(String date, String state, String city, int requiredGDD, double requiredWater, int baseTemp, double amountN, double area){
		
		try {
			d = format.parse(date);
		}
		catch (Exception e){
			System.out.println("Make sure that the form is filled out correctly");
		}
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
    	int day = c.get(Calendar.DAY_OF_MONTH);
    	this.requiredWater = requiredWater;
    	this.area = area;
    	this.amountN = amountN;
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
		//System.out.println(requiredWater);
		if(precip >= requiredWater) return "No irrigation needed";
		else inches = requiredWater - precip;
		volume = area * inches / 12.0 * 7.48052; 
		NumberFormat formatter = new DecimalFormat("###");  
		String gallons = formatter.format(volume);  
		return "Irrigate with " + gallons + " gallons of water";
	}

	public void setN(double nitrogen){
 		n = nitrogen;
	}

	public String requiredN(){
		double nNeeded;
		if(amountN >= n) return "No fertilizing needed";
		else nNeeded = n - amountN;
		double poundsN = area * 2.29568e-5 * nNeeded;
		NumberFormat formatter = new DecimalFormat("###");  
		String pounds = formatter.format(poundsN);  
		return "Before sowing, fertilize with " + pounds + " lb. N fertilizer";

	}



}
		
