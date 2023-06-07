package p574_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iNums[] = new int[3];

		for (int i = 0; i < iNums.length; i++) {
			iNums[i] = sc.nextInt();
		}

		sc.close();

		System.out.println(findMax(iNums));
	}

	static int findMax(int iNums[]) {
		int iMax = Integer.MIN_VALUE;
		for (int i = 0; i < iNums.length; i++) {
			iMax = iNums[i] > iMax ? iNums[i] : iMax;
		}
		return iMax;

	}

}
