package p563;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] iNums1 = new int[10];
		int[] iNums2 = new int[10];
		for (int i = 0; i < iNums1.length; i++) {
			iNums1[i] = sc.nextInt();
		}

		sc.close();

		for (int i = 0; i < iNums1.length; i++) {
			int iMax = Integer.MIN_VALUE;

			for (int j = 0; j < iNums1.length; j++) {
				iMax = iMax < iNums1[j] ? iNums1[j] : iMax;
			}

			iNums2[i] = iMax;

			for (int j = 0; j < iNums1.length; j++) {
				if (iMax == iNums1[j]) {
					iNums1[j] = Integer.MIN_VALUE;
					break;
				}
			}

		}
		for (int i = 0; i < iNums2.length; i++) {
			System.out.print(iNums2[i] + " ");
		}
	}
}
