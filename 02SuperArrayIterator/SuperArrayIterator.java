import java.util.*;
public class SuperArrayIterator implements Iterator<String>{
	private SuperArray data;
	private int position;
	
	public SuperArrayIterator (SuperArray data){
		this.data = data;
		position = 0;
	}
	
	public boolean hasNext(){
		return position < data.size();
	}
	
	public String next(){
		if(hasNext()){
			position++;
			return data.get(position - 1);
		}
		else throw new NoSuchElementException();
	}
	
	public void remove(){
		throw new UnsupportedOperationException()
;	}
}