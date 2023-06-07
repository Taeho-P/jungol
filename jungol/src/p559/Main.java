package p559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] dS = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		int iA = sc.nextInt();
		int iB = sc.nextInt();

		sc.close();

		System.out.printf("%.1f", dS[iA - 1] + dS[iB - 1]);

	}

}
