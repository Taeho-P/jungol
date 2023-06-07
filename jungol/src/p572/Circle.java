package p572;

public class Circle {
	int iR;

	void setiR(int iR) {
		this.iR = iR;
	}

	void dCal() {
		double dCir = iR * iR * 3.14;
		System.out.printf("%.2f", dCir);
	}
}
