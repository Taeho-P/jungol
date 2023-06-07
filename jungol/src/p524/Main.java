package p524;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iA = sc.nextInt();
		int iB = sc.nextInt();

		sc.close();

		boolean bT = 0 != (iA * iB);
		boolean bS = 0 != (iA + iB);

		System.out.print(bT + " " + bS);
	}

}
