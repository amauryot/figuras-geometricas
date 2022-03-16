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
	
	@Override
	public double getPerimeter() {
		return base + side1 + side2; // P = b + l1 + l2
	}

	@Override
	public double getArea() {
		return (base * height) / 2; // A = (b.h) / 2
	}
}
