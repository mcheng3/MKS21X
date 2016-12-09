public class Barcode{
    private String _zip;
    private int _checkDigit;

    public Barcode(String zip){
	_zip = zip;
	checkSum();
    }
    
    public Barcode clone(){
	return this;
    }
    
    private int checkSum(){
	int sum = 0;
	for(int i = 0; i< _zip.length() - 1; i++){
	    sum += Integer.parseInt(_zip.substring(i, i+1));
      	}
	System.out.println(sum);
	return sum % 10;
    }
    
    public static void main(String[] args){
	Barcode a = new Barcode("01005");
    }
}


				    

