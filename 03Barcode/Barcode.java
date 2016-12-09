public class Barcode{
    private String _zip;
    private int _checkDigit;

    public Barcode(String zip){
	_zip = zip;
	checkSum();
    }

    public String toString(){
	String code = "|";
	for(int i = 0; i< _zip.length(); i++){
	    switch(_zip.charAt(i) - '0'){
	    case 1: code += ":::||";
      	}
	return code + ;
    }
    
    public Barcode clone(){
	return this;
    }
    
    private int checkSum(){
	int sum = 0;
	for(int i = 0; i< _zip.length() - 1; i++){
	    sum += _zip.charAt(i) - '0';
      	}
	System.out.println(sum);
	return sum % 10;
    }
    
    /*public static String toCode(String zip){
	for(int i = 0; i< _zip.length(); i++){
	   
      	}
	return "";
	}*/
	
    public static void main(String[] args){
	Barcode a = new Barcode("01305");
    }

   
}


				    

