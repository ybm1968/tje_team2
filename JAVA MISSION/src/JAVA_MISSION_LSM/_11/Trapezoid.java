package JAVA_MISSION_LSM._11;

public class Trapezoid {

	double top;
	double bottom;
	double height;
		
	public Trapezoid() {
		super();
	}

	public Trapezoid(double top, double bottom, double height) {
		super();
		this.top = top;
		this.bottom = bottom;
		this.height = height;
	}

	public double getArea() {
		return ((top + bottom) * height) / 2;
	}
	
	
	@Override
	public String toString() {
		return "Trapezoid [top=" + top + ", bottom=" + bottom + ", height=" + height + "]";
	}

	
}
