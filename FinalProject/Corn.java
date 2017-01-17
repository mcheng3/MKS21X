public class Corn extends Crop{
	private int n = 0;
	public Corn(String date, String state, String city, String soilType, int amountN, double radius){
		super(date, state, city, 2100, 18.0, 50, Math.PI * Math.pow(radius, 2));
		if (soilType.equals("Loam")) n = 160;
		else if (soilType.equals("Sand")) n = 130;
		else if (soilType.equals("Clay")) n = 160;
	}
		
	


	public static void main(String[]args){
		Corn plot1 = new Corn("4/11/2016", "OK", "Oklahoma City", "Loam", 120, 2000.0);
		System.out.println(plot1.harvestDate());
		System.out.println(plot1.waterNeeded());
		Corn plot2 = new Corn("4/11/2016", "TX", "Dallas", "Sand", 120, 1.0);
		//System.out.println(plot2.harvestDate());
		System.out.println(plot2.waterNeeded());
	}
}
