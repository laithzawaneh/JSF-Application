package javacourse;

public class Rectangel extends Shape {

	private double height;
	private double width;

	public Rectangel() {

	}

	public Rectangel(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return height * width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangel [height=" + height + ", width=" + width + "]";
	}

}
