package model;

public abstract class Quadrilateral {

	private double side1;
	private double side2;
	private double side3;
	private double side4;
	
	public Quadrilateral(double side1, double side2, double side3, double side4) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
	}
	
	public double side1() {
		return side1;
	}
	
	public double side2() {
		return side2;
	}
	
	public double side3() {
		return side3;
	}
	
	public double side4() {
		return side4;
	}
}
