package p1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			int iS = sc.nextInt();

			int iE = sc.nextInt();

			if (iS < 2 || iS > 9 || iE < 2 || iE > 9) {
				System.out.print("INPUT ERROR");
				continue;
			} else if (iS > iE) {
				for (int i = iS; i >= iE; i--) {
					for (int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + i * j);
					}
					System.out.println();
				}
				break;
			} else {
				for (int k = iS; k <= iE; k++) {
					for (int f = 1; f <= 9; f++) {
						System.out.println(k + " * " + f + " = " + k * f);
					}
					System.out.println();
				}
				break;
			}

		}
		sc.close();
	}
}