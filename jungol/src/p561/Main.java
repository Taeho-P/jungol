package p561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] iNums = new int[10];

		int iMax = 0;
		int iMin = 10000;

		for (int i = 0; i < iNums.length; i++) {
			iNums[i] = sc.nextInt();
			if (iNums[i] < 100) {
				iMax = iMax < iNums[i] ? iNums[i] : iMax;
			} else {
				iMin = iMin > iNums[i] ? iNums[i] : iMin;
			}
		}

		sc.close();

		iMax = iMax == 0 ? 100 : iMax;
		iMin = iMin == 10000 ? 100 : iMin;

		System.out.print(iMax + " " + iMin);
	}

}
