package p601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String sA = sc.next();

		sc.close();

		for (int i = 0, j = sA.length() - 1; i < sA.length(); i++, j--) {
			for (int k = j; k < sA.length(); k++) {
				System.out.print(sA.charAt(k));
			}
			for (int f = 0; f < j; f++) {
				System.out.print(sA.charAt(f));
			}
			System.out.println();
		}

	}

}
