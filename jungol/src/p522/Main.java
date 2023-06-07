package p522;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iA = sc.nextInt();
		int iB = sc.nextInt();

		sc.close();

		boolean bS = iA == iB;
		System.out.println(bS);
		System.out.println(!bS);

		if (iA == iB) {
			System.out.println(bS);
		} else {
			System.out.println(bS);
		}

		if (iA != iB) {
			System.out.println(!bS);
		} else {
			System.out.println(!bS);
		}

	}

}
