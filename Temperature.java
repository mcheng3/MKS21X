public class Temperature{
    public static double CToF(double t){
        int f = 0;
        f = 1.8 * t + 32;
        return f;
    }
    
    public static double FToC(double t){
        int c = 0;
        c = (t - 32) / 1.8;
        return c;
    }
    
    public static void main(String[] args){
        System.out.println(Temperature.CToF(100.0));
        System.out.println(Temperature.FToC(32.0));
}
    
      
