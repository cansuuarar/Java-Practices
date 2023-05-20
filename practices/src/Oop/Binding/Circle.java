package Oop.Binding;

public class Circle extends Shape {

	private double radius;
	
//	public Circle() {
//		// TODO Auto-generated constructor stub
//	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	


//	public Circle() {
//		super();
//		System.out.println("circle nesnesi yaratıldı.");
//	}
	
	
	public void draw() {
		super.draw();
		System.out.println("circle çizildi.");
	}
	

	public void erase() {
		super.erase();
		System.out.println("circle is erased");
	}

	
	public double calculateArea(double radius) {
		System.out.println("alanı: ");
		double area = Math.PI * Math.pow(getRadius(), 2);
		return area;
	}
	
	public void calculate(double radius) {
		double alan = Math.PI * Math.pow(getRadius(), 2);
		System.out.println(alan);
	}

	
	public double calculateCircumference() {
		System.out.println("çevresi: ");
		double circumference = Math.PI * 2 * radius;
		return circumference;
	}

}
