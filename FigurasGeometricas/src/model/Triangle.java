package model;

public class Triangle implements GeometricFigure {

	private double base;
	private double side1;
	private double side2;
	private double height;
	
	public Triangle(double base, double side1, double side2, double height) {
		this.base = base;
		this.side1 = side1;
		this.side2 = side2;
		this.height = height;
	}
	
	private double condition() {
		return Math.sqrt((side1*side1) - (height*height)) + Math.sqrt((side2*side2) - (height*height)); // √(l1² - h²) + √(l2² - h²)
	}
	
	public boolean isValid() {
		return (Math.abs(base - condition()) < 0.1); // b ~ √(l1² - h²) + √(l2² - h²)
	}
	
	@Override
	public double getPerimeter() {
		return base + side1 + side2; // P = b + l1 + l2
	}

	@Override
	public double getArea() {
		return (base * height) / 2; // A = (b.h) / 2
	}
}
