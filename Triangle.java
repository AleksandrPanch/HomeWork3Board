package com.gmail.rezus;

public class Triangle extends Shape {

	private Point a;
	private Point b;
	private Point c;

	public Triangle() {
	}

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
	}

	@Override
	public double getArea() {
		double p = this.getPerimetr() / 2.0;
		return Math.sqrt(p * (p - Point.calculationDistance(a, b)) * (p - Point.calculationDistance(b, c))
				* (p - Point.calculationDistance(c, a)));
	}

	@Override
	public double getPerimetr() {
		return Point.calculationDistance(a, b) + Point.calculationDistance(a, c) + Point.calculationDistance(c, b);
	}
}
