
public class Corn extends Crop{
	public Corn(String date, String state, String city, String soilType, int amountN){
		super(date, state, city, 2100, 18, 50, 50);
		int requiredN;
		if (soilType.equals("Loam")) requiredN = 160;
		else if (soilType.equals("Sand")) requiredN = 130;
		else if (soilType.equals("Clay")) requiredN = 160;
		
	}


	public static void main(String[]args){
		Corn plot1 = new Corn("4/11/2016", "OK", "Oklahoma City", "Loam", 30);
		System.out.println(plot1.harvestDate());
	}
}