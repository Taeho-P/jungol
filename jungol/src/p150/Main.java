package p150;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] cA = new char[10];

		for (int i = 0; i < cA.length; i++) {
			cA[i] = sc.next().charAt(0);
		}

		sc.close();

		for (int i = cA.length - 1; i >= 0; i--) {
			System.out.print(cA[i] + " ");
		}
	}

}
