package javacourse;

public class Circle {

	int radiuse;
	double pi = 3.14;

//	public int getRadiuse() {
//		return radiuse;
//	}
//
//	public void setRadiuse(int radiuse) {
//		this.radiuse = radiuse;
//	}

	public double getArea(int radiuse) {
		this.radiuse=radiuse;
		return pi * radiuse * radiuse;
	}

	public double getRound(int radiuse) {
		this.radiuse=radiuse;
		return 2 * pi * radiuse;
	}

}
