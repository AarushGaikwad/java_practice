package abstractionPractice;

interface Vehicles {
	void start();
	void stop();
}

interface Fuel {
	void typeOfFuel();
}

//implemented classes should have the declared method of abstract classes or interfaces
class Car implements Vehicles, Fuel {
	public void start() {
		System.out.println("car starts by key ignition");
	}
	public void stop() {
		System.out.println("car is stopped by using hydraulic brakes");
	}
	public void typeOfFuel() {
		System.out.println("car uses dieasel, petrol and car are electric");
	}
}

class Bike implements Vehicles, Fuel {
	public void start() {
		System.out.println("bike engine is started");
	}
	public void stop() {
		System.out.println("bike engine has stopped");
	}
	public void typeOfFuel() {
		System.out.println("bike uses petrol");
	}
}

public class Vehicle {
	public static void main(String[] args) {
		Car car = new Car();
		Bike bike = new Bike();
		
		
		
		car.start();
		bike.start();
		
		car.stop();
		bike.stop();
		
		car.typeOfFuel();
		bike.typeOfFuel();
		
		
	}
}
