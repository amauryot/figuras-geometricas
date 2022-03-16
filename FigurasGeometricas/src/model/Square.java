package model;

public class Square extends Quadrilateral implements GeometricFigure {
	
	public Square(double side) {
		super(side, side, side, side);
	}

	@Override
	public double getPerimeter() {
		return 4 * super.side1(); // P = 4l
	}

	@Override
	public double getArea() {
		return super.side1() * super.side1(); // A = l²
	}
}
