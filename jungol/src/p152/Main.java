package p152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] iNums = new int[10];

		int iOdd = 0;
		int iEven = 0;

		for (int i = 0; i < iNums.length; i++) {
			iNums[i] = sc.nextInt();
			if (i % 2 == 0) {
				iOdd += iNums[i];
			} else {
				iEven += iNums[i];
			}
		}
		sc.close();

		System.out.println("odd : " + iOdd);
		System.out.println("even : " + iEven);

	}

}
