package p537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		int iBreak = cs.nextInt();
		cs.close();

		int iNum = 1;
		int iSum = 1;

		while (iNum <= 100) {
			iSum = iSum + ++iNum;

			if (iNum == iBreak) {
				System.out.printf("%d", iSum);
				break;
			}
		}
	}

}
