package packagee;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("My Car: " + myCar.year + " " + myCar.make + " " + myCar.model + " " +  myCar.speed  + " " + myCar.distance);
		
		myCar.make = "Mercedes";
		myCar.model = "E200";
		myCar.year = "2011";
		myCar.speed = 80;
		myCar.distance = 30_000;	

		System.out.println("My Car: " + myCar.year + " " + myCar.make + " " + myCar.model + " " +  myCar.speed  + " " + myCar.distance);
		
		Car yourCar = new Car();
		yourCar.make = "Toyota";
		yourCar.model = "Camry";
		yourCar.year = "2011";
		yourCar.speed = 0;
		yourCar.distance = 60_000;
		System.out.println("Your Car: " + yourCar.year + " " + yourCar.make + " " + yourCar.model + " " +  yourCar.speed  + " " + yourCar.distance);

		System.out.println();
	}

}