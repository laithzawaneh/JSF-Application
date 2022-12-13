package javacourse;

public class TestShape {

	public static void main(String[] args) {
		Rectangel rectangle =new Rectangel(10,5);
		Triangle triangle =new Triangle(5,6);
		
		System.out.println("Area for rectanglr : "+rectangle.calcArea());
		System.out.println("Area for rectanglr : "+triangle.calcArea());


	}

}
