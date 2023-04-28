package p529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iT = sc.nextInt();
		int iW = sc.nextInt();

		sc.close();

		int iF = iW + 100 - iT;

		System.out.printf("%d", iF);

		if (iF > 0) {
			System.out.println("\nObesity");
		}

	}

}


