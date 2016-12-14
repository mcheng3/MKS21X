import java.util.*;
public class Sorts{
    public static String name(){
	return "06.Cheng.Michael"; 
    }

    /**Selection sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    public static void selectionSort(int[] data){
	int[]sorted = new int[data.length];


	for(int element = 0; element<data.length;element++){
	    int less = element;
	    for(int x = element + 1;x<data.length; x++){
		if(data[x] < data[less]) less = x;
	    }
	    System.out.println("Less: "+ data[less]+ " Element: " + data[element]);
	    sorted[element] = data[less];
	    data[less] = data[element];
	    data[element] = sorted[element];
	}	
    }

    public static void insertionSort(int[]data){
	for(int x = 0; x<data.length-1; x++){
	    int y = x;
	    while(data[y+1]<data[y] && y>0){
		int temp = data[x];
	        data[x] = data[x+1];
		data[x+1] = temp;
		y--;
	       
	    }
	    System.out.println(Arrays.toString(data));
	}
    }
		
	
    public static void main(String[] args){
	int[]ary = {64, 25, 12, 22, 11, 345, 3245 ,0234, 34, 643};
	int[]ary2 = {64, 25, 12, 22, 11, 345, 3245 ,0234, 34, 643};

	Sorts.selectionSort(ary);
	for(int x: ary){
	    System.out.println(x);
	}
	System.out.println();
	Sorts.insertionSort(ary2);
	for(int x: ary2){
	    System.out.println(x);
	}
    }
}

