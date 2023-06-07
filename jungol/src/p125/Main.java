package p125;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iA = sc.nextInt();

		sc.close();

		for (int i = 0; i < iA; i++) {
			System.out.print(i + 1 + " ");
		}

	}

}
