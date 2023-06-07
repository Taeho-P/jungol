package p525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iNum1 = sc.nextInt();
		int iNum2 = sc.nextInt();
		int iNum3 = sc.nextInt();

		sc.close();

		boolean bA = (iNum1 > iNum2 && iNum1 > iNum3);
		boolean bS = (iNum1 == iNum2 && iNum2 == iNum3);

		System.out.print(bA + " " + bS);
	}

}
