package com.gmail.rezus;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape triangle = new Triangle(new Point(0, 0), new Point(0, 4), new Point(3, 0));
		System.out.println(triangle);
		System.out.println(triangle.getArea());
		System.out.println(triangle.getPerimetr());

		System.out.println();

		Shape circle = new Circle(new Point(0, 0), new Point(3, 0));
		System.out.println(circle);
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimetr());

		System.out.println();

		Shape quadrangle = new Quadrangle(new Point(0, 0), new Point(2, 0), new Point(2, 2), new Point(2, 0));
		System.out.println(quadrangle);
		System.out.println(quadrangle.getArea());
		System.out.println(quadrangle.getPerimetr());

		System.out.println();

		Board board = new Board();
		board.addShape(triangle, 1);
		board.addShape(triangle, 1); // не добавится так как часть заполнена
		board.addShape(triangle, 5); // не добавится так как нет такой части
		board.addShape(circle, 2);
		board.addShape(quadrangle, 3);
		board.addShape(quadrangle);
		board.addShape(quadrangle); // не добавится так как нет места
		board.delShape(5); // не удалится так как нет такой части
		board.delShape(3);
		board.addShape(triangle, 3);

		System.out.println();

		board.info();
	}

}
