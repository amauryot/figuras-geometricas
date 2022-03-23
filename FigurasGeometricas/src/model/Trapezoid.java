package model;

public class Trapezoid extends Quadrilateral implements GeometricFigure {

	private double height;
	
	public Trapezoid(double side1, double side2, double majorBase, double minorBase, double height) {
		super(side1, side2, majorBase, minorBase);
		this.height = height;
	}

	private double condition() {
		return Math.sqrt((super.side1()*super.side1()) - (height*height)) +
			   Math.sqrt((super.side2()*super.side2()) - (height*height)) + super.side4(); // √(l1² - h²) + √(l2² - h²) + b
	}
	
	public boolean isValid() {
		return (Math.abs(super.side3() - condition()) < 0.1); // B ~ √(l1² - h²) + √(l2² - h²) + b
	}
	
	@Override
	public double getPerimeter() {
		return super.side1() + super.side2() + super.side3() + super.side4(); // P = l1 + l2 + B + b
	}

	@Override
	public double getArea() {
		return ((super.side3() + super.side4()) * height) / 2; // A = (B + b).h / 2
	}
}
