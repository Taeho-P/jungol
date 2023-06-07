package p113;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iW = sc.nextInt();
		int iL = sc.nextInt();

		sc.close();

		int iWP = iW + 5;
		int iLP = iL * 2;

		System.out.println("width = " + iWP);
		System.out.println("length = " + iLP);
		System.out.println("area = " + iWP * iLP);
	}
}
