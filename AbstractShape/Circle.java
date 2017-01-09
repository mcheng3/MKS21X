public class Circle extends Shape{
	private double radius;
	public Circle(){
		radius = 1.0;
	}

	public Circle(double r){
		radius = r;
	}
	
	public void set(double r){
		radius = r;
	}

	public double get(){
		return radius;
	}

	public String toString(){
		return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
	}

	public double getPerimeter(){
		return 2.0 * Math.PI * radius;
	}

	public double getArea(){
		return Math.pow(radius, 2.0) * Math.PI;
	}
}