package com.corejava.factory;

public class ShapeFactory {

	public static Shape getShape(ShapeType shapeType) {
		Shape shape = null;
		switch (shapeType) {
		case CIRCLE:
			shape = new Circle();
			break;

		case RECTANGLE:
			shape = new Rectangle();
			break;

		case SQUARE:
			shape = new Square();
			break;

		default:
			break;
		}
		return shape;
	}
}
