package p632;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] iNums = new int[3];

		for (int i = 0; i < iNums.length; i++) {
			iNums[i] = sc.nextInt();
		}
		sc.close();

		int iA = iNums[0];

		for (int i = 1; i < iNums.length; i++) {
			iA = iA > iNums[i] ? iNums[i] : iA;
		}
		System.out.print(iA);
	}

}
