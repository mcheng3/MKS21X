
public class SuperArray{
	private String[] data;
	private int size;
	
	//0
	//constructor make an empty superArray should make size 0, 
	//but the data capacity 10.
	public SuperArray(){
		data = new String[10];
		size = 0;
	}

	public SuperArray(int initialCapacity){
		if(initialCapacity < 0) throw new IllegalArgumentException();
		data = new String[initialCapacity];
		size = 0;
	}

	public int size(){
		return size;
	}

	//1
	public boolean add(String n){
		if(size >= data.length){
			grow();
		}
		data[size] = n;
		size++; 
		//System.out.println(toStringDebug());
		return true;
	}

	public void trimToSize(){
		String[] dataTemp;
			dataTemp = new String[size];
			for(int i = 0; i < size; i++){
				dataTemp[i] = data[i];   
			}
			data = dataTemp;
	}

	private void grow(){
		String[] dataTemp;
			dataTemp = new String[data.length * 2];
			for(int i = 0; i < data.length; i++){
				dataTemp[i] = data[i];   
			}
			data = dataTemp;
	}

	//3
	public String toString(){
		String s = "[ " + data[0];
		for(int i = 1; i < size; i++){
			s += ", " + data[i] ;
		}
		s +="]";
		return s;
	}

	//4 
	public String toStringDebug(){
		String s = "[ " + data[0];
		for(int i = 1; i < size; i++){
			s += ", " + data[i] ;
		}
		for(int i = size + 1; i <= data.length; i++){
			s += ", _";
		}
		s += "]";
		return s;
	}

	public String get(int index){
		if(index < 0 || index >= size()) throw new IndexOutOfBoundsException();
		return data[index];
	}

	public void clear(){
		data = new String[10];
		size = 0;
	}

	public boolean isEmpty(){
		return size == 0;
	}

	public String set(int index, String element){
		if(index < 0 || index >= size()) throw new IndexOutOfBoundsException();
		String val = data[index];
		data[index] = element;
		return val;
	}
	public void add(int index, String element){
		if(index < 0 || index > size()) throw new IndexOutOfBoundsException();
		if(size == data.length) grow();
		for(int i = size; i > index ; i--){
			data[i] = data[i-1];
		}
		data[index] = element;
		size++;
		//System.out.println(toStringDebug());
	}
	public String remove(int index){
		if(index < 0 || index >= size()) throw new IndexOutOfBoundsException();
		String val = data[index];
		for(int i = index; i < size - 1; i++){
			System.out.println(i);
			data[i] = data[i+1];
		}
		size--;
		System.out.println(toStringDebug());
		return val;
	}
	public String[] toArray(){
		String[] ary;
		ary = new String[size];
		for(int i = 0; i < size; i++){
			ary[i] = data[i];
		}
		return ary;
	}
	public int indexOf(String i){
		for(int c = 0; c < size; c++){
			if(i.equals(data[c])) return c;
		}
		return -1;
	}
	public int lastIndexOf(String i){
		for(int c = size -1; c >= 0; c--){
			if(i.equals(data[c])) return c; 
		}
		return -1;
	}
}