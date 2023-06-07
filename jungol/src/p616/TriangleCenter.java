package p616;

public class TriangleCenter {
	int iX1 = 0;
	int iY1 = 0;
	
	int iX2 = 0;
	int iY2 = 0;
	
	int iX3 = 0;
	int iY3 = 0;
	
	double dXc = (double)(iX1 + iX2 + iX3)/3;
	double dYc = (double)(iY1 + iY2 + iY3)/3;
	
	
	public TriangleCenter(int x1, int y1, int x2, int y2, int x3, int y3) {
		iX1 = x1;
		iY1 = y1;
		
		iX2 = x2;
		iY2 = y2;
		
		iX3 = x3;
		iY3 = y3;
		
		dXc = (double)(iX1 + iX2 + iX3)/3;
		dYc = (double)(iY1 + iY2 + iY3)/3;
	}
}



