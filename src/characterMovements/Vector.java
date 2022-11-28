package characterMovements;

class Point {
	double x;
	double y;
	double z;
	public Point(double x, double y, double z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
}

public class Vector {
	double i;
	double j;
	double k;
	// constructor
		public Vector(double x, double y, double z) {
			this.i=x;
			this.j=y;
			this.k=z;
		}
		public Vector (Point from, Point to) {
			this.i=to.x-from.x;
			this.j=to.y-from.y;
			this.k=to.z-from.z;
		}
		public Vector (Vector v) {
			this.i=v.i;
			this.j=v.j;
			this.k=v.k;
		}
	
		
	public double length() {
		return Math.sqrt(i*i + j*j+ k*k);
	}
	public double lengthSq() {
		return i*i + j*j + k*k; // to compare distance no need sqrt 
	}
	public void scale(double n) {
		i*=n;
		j*=n;
		k*=n;
	}
	public static Vector normalize(Vector v) { // to normalize -> to convert vector to unit vector
		return new Vector(v.i/v.length(), v.j/v.length(), v.k/v.length());
	}
	public static Vector add(Vector a, Vector b) {
		return new Vector(a.i+b.i, a.j+b.j, a.k+b.k);
	}
	
}
