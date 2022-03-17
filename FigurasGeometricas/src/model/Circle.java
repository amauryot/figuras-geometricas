package model;

public class Circle implements GeometricFigure {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public boolean isValid() {
		return (radius > 0);
	}
	
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius; // P = 2πr
	}

	@Override
	public double getArea() {
		return Math.PI * (radius*radius); // A = πr²
	}
}
