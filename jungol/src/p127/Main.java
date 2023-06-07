package p127;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iSum = 0;
		int iCnt = 0;
		boolean bS = true;

		while (bS) {
			int iN = sc.nextInt();
			if (iN < 0 || iN > 100) {
				bS = false;
				break;
			}
			iSum += iN;
			iCnt++;
		}

		sc.close();

		System.out.println("sum : " + iSum);
		System.out.printf("avg : %.1f", (double) iSum / iCnt);
	}

}
