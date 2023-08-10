package JAVA_MISSION_LSM._11;

public class Triangle {

	double width;
	double height;
	
	// 생성자
	public Triangle() {
		super();
	}
	
	public Triangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height / 2;
	}
	
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	
}
