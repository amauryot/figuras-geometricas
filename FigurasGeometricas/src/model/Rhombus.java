package model;

public class Rhombus extends Quadrilateral implements GeometricFigure {

	private double majorDiagonal;
	private double minorDiagonal;
	
	public Rhombus(double majorDiagonal, double minorDiagonal, double side) {
		super(side, side, side, side);
		this.majorDiagonal = majorDiagonal;
		this.minorDiagonal = minorDiagonal;
	}

	@Override
	public double getPerimeter() {
		return 4 * super.side1(); // P = 4l
	}

	@Override
	public double getArea() {
		return (majorDiagonal * minorDiagonal) / 2; // A = (D.d) / 2
	}
}
