package p596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String sS = sc.next();
		int iC = sc.nextInt();

		sc.close();

		iC = (sS.length() < iC) ? sS.length() : iC;

		for (int i = sS.length() - 1; i >= sS.length() - iC; i--) {
			System.out.print(sS.charAt(i));
		}
	}

}
