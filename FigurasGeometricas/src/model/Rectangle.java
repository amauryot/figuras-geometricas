package model;

public class Rectangle extends Quadrilateral implements GeometricFigure {
	
	public Rectangle(double base, double height) {
		super(base, height, base, height);
	}

	public boolean isValid() {
		return (super.side1() > 0) && (super.side2() > 0);
	}
	
	@Override
	public double getPerimeter() {
		return 2 * (super.side1() + super.side2()); // P = 2.(b + h)
	}

	@Override
	public double getArea() {
		return super.side1() * super.side2(); // A = b.h
	}
}
