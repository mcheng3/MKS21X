
public class Wheat extends Crop{
	public Wheat(String date, String state, String city, String soilType, int amountN){
		super(date, state, city, 2000, 12, 40, 50);
		int requiredN;
		if (soilType.equals("Loam")) requiredN = 160;
		else if (soilType.equals("Sand")) requiredN = 130;
		else if (soilType.equals("Clay")) requiredN = 160;
		
	}


	public static void main(String[]args){
		Wheat plot1 = new Wheat("4/11/2016", "OK", "Oklahoma City", "Loam", 30);
		System.out.println(plot1.harvestDate());
	}
}