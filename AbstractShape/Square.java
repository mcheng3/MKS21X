public class Square extends Rectangle{
	
	public Square(){
		super();
	}
	
	public Square(double x){
		super(x, x);
	}
	
	public void setLength(double l){
		super.setLength(l);
		super.setWidth(l);
	}
	
	public void setWidth(double w){
		super.setLength(w);
		super.setWidth(w);
	}

	public String toString(){
		return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
	}
}
