package classesAndObjects2;

public class Point {
	
	int x;
	int y;
	
	int getX() {
		return x;
	}
	
	void setX(int x) {
		this.x = x;
	}
	
	
	int getY() {
		return y;
	}
	
	void setY(int y) {
		this.y = y;
	}
	
	
	void distanceToCenter(int x, int y) {
		double a = Math.pow(x, y);
		System.out.println(Math.sqrt(a));
	
	}
	
	void distanceToPoint(int x, int y) {
		
	}

}
