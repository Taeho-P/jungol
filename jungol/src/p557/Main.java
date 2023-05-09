package p557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] cList = new char[10];
		
		for (int i = 0; i < cList.length; i++) {
			cList[i] = sc.next().charAt(0);

			if (i == 0 || i == 3 || i == 6) {
				System.out.print(cList[i] + " ");
			}
		}
		sc.close();

	}

}
