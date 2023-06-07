package p562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] iNums = new int[10];

		int iS = 0;
		int iA = 0;
		int iAC = 0;
		for (int i = 0; i < iNums.length; i++) {
			iNums[i] = sc.nextInt();
			if ((i + 1) % 2 == 0) {
				iS += iNums[i];
			} else {
				iA += iNums[i];
				iAC++;
			}
		}
		sc.close();

		System.out.println("sum : " + iS);
		System.out.printf("avg : %.1f", (double) iA / iAC);
	}

}
