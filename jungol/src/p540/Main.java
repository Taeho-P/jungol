package p540;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int iN = sc.nextInt();

			int iA = iN % 3;

			if (iA == 0) {
				System.out.println(iN / 3);
			}

			if (iN == -1) {
				sc.close();
				break;
			}
		}

	}

}
