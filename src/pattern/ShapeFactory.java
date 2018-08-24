package pattern;

public class ShapeFactory {

	public static Shape getShape(String shape) {

		if (shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("Square")) {
			return new Square();
		} else if (shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else {
			return null;
		}
	}
}
