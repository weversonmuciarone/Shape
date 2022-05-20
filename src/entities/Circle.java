package entities;

public class Circle extends Shape {
	
	private double radius;
	
	public Circle() {
		super();
	}
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	

}
