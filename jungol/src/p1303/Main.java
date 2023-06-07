package p1303;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iH = sc.nextInt();
		int iW = sc.nextInt();

		for (int i = 0; i < iH; i++) {
			for (int j = 1; j <= iW; j++) {
				System.out.print(i * iW + j + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
