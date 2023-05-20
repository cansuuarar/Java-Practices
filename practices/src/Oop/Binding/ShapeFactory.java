package Oop.Binding;

public class ShapeFactory {

	public Shape createShape() {
		Shape s = null;

		int i = (int) (5 * Math.random());
		switch (i) {
		case 0:
			s = new Circle(3);
			break;
		case 1:
			s = new Rectangle(5, 5);
			break;
		case 2:
			s = new Square(5);
			break;
		}

		return s;
	}

}
