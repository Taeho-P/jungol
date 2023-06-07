package p574;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] iNums = new int[3];

		for (int i = 0; i < iNums.length; i++) {
			iNums[i] = sc.nextInt();
		}

		sc.close();

		MaxInt mCase1 = new MaxInt(iNums);
		System.out.println(mCase1.getMax());
	}

}
