package p120;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iA = sc.nextInt();
		int iB = sc.nextInt();

		sc.close();

		int iG = iA >= iB ? iA - iB : iB - iA;

		System.out.println(iG);

	}

}
