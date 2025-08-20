package abstractionPractice;
abstract class Shapes {
	abstract double area();
}

class Rectangle extends Shapes {
	double length;
	double width;
	
	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	double area() {
		return length * width;
	}
}

class Circle extends Shapes {
	double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	double area() {
		return Math.PI * radius * radius;
	}
}

public class Shape {
	public static void main(String[] args) {
		Shapes rectangle = new Rectangle(9, 7);
		Shapes circle = new Circle(7);
	
		System.out.println("area of rectangle is: " + rectangle.area());
		System.out.println("area of circle is: " + circle.area());
	}
}
