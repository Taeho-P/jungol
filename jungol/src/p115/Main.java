package p115;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iMT = sc.nextInt();
		int iMW = sc.nextInt();

		int iGT = sc.nextInt();
		int iGW = sc.nextInt();

		sc.close();

		boolean bA = (iMT > iGT && iMW > iGW);

		System.out.println(bA);
	}

}
