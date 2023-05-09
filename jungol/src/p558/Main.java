package p558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] iNums = new int[100];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < iNums.length; i++) {
			iNums[i] = sc.nextInt();
			if (iNums[i] == 0) {
				for (int j = i - 1; j >= 0; j--) {
					System.out.print(iNums[j] + " ");
				}
				sc.close();
				break;
			}
		}

	}

}
