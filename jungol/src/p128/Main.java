package p128;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iC = 0;
		while (true) {
			int iNum = sc.nextInt();
			if (iNum == 0) {
				break;
			} else if (iNum % 3 != 0 && iNum % 5 != 0) {
				iC++;
			}
		}
		sc.close();
		System.out.println(iC);
	}
}
