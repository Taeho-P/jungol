package p572;

import java.util.Scanner;

class Circle {
	int iR;
	double dP;
	
	Circle() {
		iR = 0;
		dP = 3.14;
	}

	void setiR(int iR) {
		this.iR = iR;
	}

	void dCal() {
		double dCir = iR * iR * dP;
		System.out.printf("%.2f", dCir);
	}
}


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iR = sc.nextInt();

		sc.close();

		Circle cCir1 = new Circle();

		cCir1.setiR(iR);
		cCir1.dCal();

	}

}
