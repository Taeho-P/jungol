package p151;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] iNums = new int[5];

		int iSum = 0;

		for (int i = 0; i < iNums.length; i++) {
			iNums[i] = sc.nextInt();
			if (i % 2 == 0) {
				iSum += iNums[i];
			}
		}
		sc.close();

		System.out.println(iSum);
	}

}
