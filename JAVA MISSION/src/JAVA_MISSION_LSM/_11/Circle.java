package JAVA_MISSION_LSM._11;

public class Circle {

	double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
