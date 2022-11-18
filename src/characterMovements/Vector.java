package characterMovements;

class Point {
	double x;
	double y;
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
	}
}

public class Vector {
	double i;
	double j;
	public double length() {
		return Math.sqrt(i*i + j*j);
	}
	public double lengthSq() {
		return i*i + j*j; // to compare distance no need sqrt 
	}
	public void scale(double n) {
		i*=n;
		j*=n;
	}
	public Vector(double x, double y) {
		this.i=x;
		this.j=y;
	}
	public Vector (Point from, Point to) {
		this.i=to.x-from.x;
		this.j=to.y-from.y;
	}
	
}
