package p616_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Triangle[] Tts = new Triangle[1];

		for (int i = 0; i < Tts.length; i++) {

			int iX1 = sc.nextInt();
			int iY1 = sc.nextInt();
			int iX2 = sc.nextInt();
			int iY2 = sc.nextInt();
			int iX3 = sc.nextInt();
			int iY3 = sc.nextInt();

			Tts[i] = new Triangle(iX1, iY1, iX2, iY2, iX3, iY3);

			System.out.printf("(%.1f, %.1f)", Tts[i].getCoGX(), Tts[i].getCoGY());
		}
		sc.close();
	}

}
