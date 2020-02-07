package com.gmail.rezus;

public class Board {

	private Shape[] parts = new Shape[4];

	public Board() {
	}

	public Shape[] getParts() {
		return parts;
	}

	public void addShape(Shape shape, int part) { // добавит фигуру в указанную часть от 1 до 4
		if (part > 0 && part < 5) {
			if (parts[part - 1] == null) {
				parts[part - 1] = shape;
				System.out.println("In part of the board № " + (part) + " figure added: " + shape);
			} else
				System.out.println("You cannot add a shape, the required part of the board is busy.");
		} else
			System.out.println("Enter the correct board part number from 1 to 4.");
	}

	public void addShape(Shape shape) { // добавит фигуру на любое свободное место (при наличии)
		boolean add = false;
		for (int i = 0; i < parts.length; i++) {
			if (parts[i] == null) {
				parts[i] = shape;
				add = true;
				System.out.println("A figure is added to the board: " + shape);
				break;
			}
		}
		if (!add)
			System.out.println("There is no free space, delete anything.");
	}

	public void delShape(int part) { // удалит фигуру из указанной части от 1 до 4
		if (part > 0 && part < 5) {
			if (parts[part - 1] != null) {
				parts[part - 1] = null;
				System.out.println("part of the board № " + (part) + " cleared.");
			} else
				System.out.println("There is nothing to delete in this part.");
		} else
			System.out.println("Enter the correct board part number from 1 to 4.");
	}

	public void info() {
		double p = 0;
		for (int i = 0; i < parts.length; i++) {
			if (parts[i] != null) {
				p += parts[i].getArea();
				System.out.println("In the part of the board № " + (i + 1) + "lies a figure: " + parts[i]);
			} else
				System.out.println("part of the board № " + (i + 1) + "is empty.");
		}
		System.out.println();
		System.out.println("The total area of the pieces on the board: " + p);
	}
}
