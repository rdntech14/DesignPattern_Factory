import pattern.Shape;
import pattern.ShapeFactory;

public class Main {

	public static void main(String[] args) {

		Shape circle = ShapeFactory.getShape("circle");
		circle.draw();

		Shape square = ShapeFactory.getShape("square");
		square.draw();

	}

}
