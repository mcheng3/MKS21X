
public class Wheat extends Crop{
	public Wheat(String date, String state, String city, String soilType, double amountN, double radius){		
		super(date, state, city, 2000, 12.0, 40, amountN, Math.PI * Math.pow(radius, 2));
		if (soilType.equals("Loam")) setN(50);
		else if (soilType.equals("Sand")) setN(30);
		else if (soilType.equals("Clay")) setN(70);
		//https://www.extension.umn.edu/agriculture/nutrient-management/nutrient-lime-guidelines/docs/FO-3772-C-1.pdf
	}

	

	public static void main(String[]args){
		Wheat plot1 = new Wheat("4/11/2016", "OK", "Oklahoma City", "Loam", 149.0, 10123.0);
		//System.out.println(plot1.harvestDate());
		System.out.println(plot1.requiredN());
	}
}
