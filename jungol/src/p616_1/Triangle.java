package p616_1;

public class Triangle {
	Point p1 = new Point(0, 0);
	Point p2 = new Point(0, 0);
	Point p3 = new Point(0, 0);

	public Triangle(int iX1, int iY1, int iX2, int iY2, int iX3, int iY3) {
		p1.iX = iX1;
		p1.iY = iY1;
		p2.iX = iX2;
		p2.iY = iY2;
		p3.iX = iX3;
		p3.iY = iY3;
	}
	
	public double getCoGX() {
		double res = (double)(p1.iX + p2.iX + p3.iX)/3;
		return res;
	}
	public double getCoGY() {
		double res = (double)(p1.iY + p2.iY + p3.iY)/3;
		return res;
	}
}
