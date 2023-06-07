package p126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iOdd = 0;
		int iEven = 0;
		boolean bS = true;
		while (bS) {
			int iN = sc.nextInt();
			if (iN == 0) {
				bS = false;
				break;
			}
			if (iN % 2 == 0) {
				iEven++;
			} else {
				iOdd++;
			}
		}
		sc.close();

		System.out.println("odd : " + iOdd);
		System.out.println("even : " + iEven);
	}
}
