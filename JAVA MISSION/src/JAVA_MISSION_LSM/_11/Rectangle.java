package JAVA_MISSION_LSM._11;

public class Rectangle {

	double width;
	double height;
	
	// 생성자
	public Rectangle() {
		super();
	}
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
}
