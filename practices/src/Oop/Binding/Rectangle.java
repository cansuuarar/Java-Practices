package Oop.Binding;

public class Rectangle extends Shape {
	private double high;
	private double base;

	public Rectangle(double high, double base) {
		super();
		this.high = high;
		this.base = base;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void draw() {
		super.draw();
		System.out.println("Rectangle çizildi.");
	}

	public void erase() {
		super.erase();
		System.out.println("Rectangle is erased");
	}

	public double calculateArea() {
		System.out.println("alanı: ");
		double area =high * base;
		return area;
	}

	public double calculateCircumference() {
		System.out.println("çevresi: ");
		double circumference = 2 * (high + base);
		return circumference;
	}

}
