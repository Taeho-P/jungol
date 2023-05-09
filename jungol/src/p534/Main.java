package p534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		sc.close();

		char cG = sc.next().charAt(0);

		int iG = (int) cG;

		switch (iG) {

		case 65:
			System.out.print("Excellent");
			break;

		case 66:
			System.out.print("Good");
			break;

		case 67:
			System.out.print("Usually");
			break;

		case 68:
			System.out.print("Effort");
			break;

		case 70:
			System.out.print("Failure");
			break;

		default:
			System.out.print("error");

		}
	}

}
