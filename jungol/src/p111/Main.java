package p111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iKo = sc.nextInt();
		int iEng = sc.nextInt();
		int iMath = sc.nextInt();
		int iCom = sc.nextInt();

		sc.close();

		int iSum = iKo + iEng + iMath + iCom;

		System.out.println("sum " + iSum);
		System.out.println("avg " + iSum / 4);
	}
}
