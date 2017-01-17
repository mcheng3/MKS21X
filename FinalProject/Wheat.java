
public class Wheat extends Crop{
	private int n = 0;
	public Wheat(String date, String state, String city, String soilType, int amountN, double radius){		
		super(date, state, city, 2000, 12.0, 40, Math.PI * Math.pow(radius, 2));
		if (soilType.equals("Loam")) n = 160;
		else if (soilType.equals("Sand")) n = 130;
		else if (soilType.equals("Clay")) n = 160;
		return n;
	}

	

	public static void main(String[]args){
		Wheat plot1 = new Wheat("4/11/2016", "OK", "Oklahoma City", "Loam", 30);
		System.out.println(plot1.harvestDate());
		
	}
}
