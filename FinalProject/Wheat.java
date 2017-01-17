
public class Wheat extends Crop{
	private int n = 0;
	public Wheat(String date, String state, String city, String soilType, double amountN, double radius){		
		super(date, state, city, 2000, 12.0, 40, amountN, Math.PI * Math.pow(radius, 2));
		if (soilType.equals("Loam")) setN(160.0);
		else if (soilType.equals("Sand")) setN(130.0);
		else if (soilType.equals("Clay")) setN(160.0);
	}

	

	public static void main(String[]args){
		Wheat plot1 = new Wheat("4/11/2016", "OK", "Oklahoma City", "Loam", 149.0, 10123.0);
		//System.out.println(plot1.harvestDate());
		System.out.println(plot1.requiredN());
	}
}
