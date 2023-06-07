package p600;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sS = sc.nextLine();
		int iCnt = 0;

		sc.close();

		for (int i = 0; i < sS.length(); i++) {
			if (sS.charAt(i) == ' ') {
				iCnt++;
			}
		}
		System.out.println(iCnt + 1);
	}
}
