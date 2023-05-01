package p539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iNum;

		int iSum = 0;

		int iCount = 0;

		while (true) {
			iNum = sc.nextInt();

			iSum = iSum + iNum;

			iCount++;

			if (iNum >= 100) {
				System.out.printf("%d%n%.1f", iSum, (float) iSum / (float) iCount);
				sc.close();
				break;
			}
		}

	}

}
