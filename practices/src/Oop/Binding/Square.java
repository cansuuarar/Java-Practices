package Oop.Binding;

public class Square extends Shape {

	private double high;

	public Square(double high) {
		super();
		this.high = high;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public void draw() {
		super.draw();
		System.out.println("Square çizildi.");
	}

	public void erase() {
		super.erase();
		System.out.println("Square is erased");
	}

	public double calculateArea() {
		System.out.println("alanı: ");
		double area = high *  high;
		return area;
	}

	public double calculateCircumference() {
		System.out.println("çevresi: ");
		double circumference = 4 * high ;
		return circumference;
	}

}
