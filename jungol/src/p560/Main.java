package p560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] iNums = new int[10];

		int iA = 1000;

		for (int i = 0; i < iNums.length; i++) {
			iNums[i] = sc.nextInt();
			iA = iA < iNums[i] ? iA : iNums[i];
		}

		sc.close();
		System.out.println(iA);
	}

}
