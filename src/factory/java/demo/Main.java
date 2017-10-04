package factory.java.demo;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// get an object of Circle and call its draw method.
		Shape shape1 = ShapeFactory.getShape(ShapeType.CIRCLE);

		// call draw method of Circle
		shape1.draw();

		// get an object of Rectangle and call its draw method.
		Shape shape2 = ShapeFactory.getShape(ShapeType.RECTANGLE);

		// call draw method of Rectangle
		shape2.draw();

		// get an object of Square and call its draw method.
		Shape shape3 = ShapeFactory.getShape(ShapeType.SQUARE);

		// call draw method of circle
		shape3.draw();
	}

}
