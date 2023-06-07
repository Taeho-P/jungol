package p616;

import java.util.Scanner;

class Triangle {
	int iX1 = 0;
	int iY1 = 0;

	int iX2 = 0;
	int iY2 = 0;

	int iX3 = 0;
	int iY3 = 0;

	double dXc = 0.0;
	double dYc = 0.0;

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		iX1 = x1;
		iY1 = y1;

		iX2 = x2;
		iY2 = y2;

		iX3 = x3;
		iY3 = y3;

		dXc = (double) (iX1 + iX2 + iX3) / 3;
		dYc = (double) (iY1 + iY2 + iY3) / 3;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Triangle[] tT = new Triangle[1];

		for (int i = 0; i < tT.length; i++) {
			int iX1 = sc.nextInt();
			int iY1 = sc.nextInt();
			int iX2 = sc.nextInt();
			int iY2 = sc.nextInt();
			int iX3 = sc.nextInt();
			int iY3 = sc.nextInt();

			tT[i] = new Triangle(iX1, iY1, iX2, iY2, iX3, iY3);

			System.out.printf("(%.1f, %.1f)", tT[i].dXc, tT[i].dYc);
		}
		sc.close();

	}

}
