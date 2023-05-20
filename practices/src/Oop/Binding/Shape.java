package Oop.Binding;

public class Shape {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Shape() {

	}

	public void draw() {
		System.out.println("şekil çizildi.");
	}

	public void erase() {
		System.out.println("şekil silindi.");
	}
	
	public void calculate(double radius) {
	}

	public double calculateArea() {
		System.out.println("alanı: ");
		return 0;
	}

	public double calculateCircumference() {
		System.out.println("çevresi: ");
		return 0;
	}

}
