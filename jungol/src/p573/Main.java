package p573;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iN = sc.nextInt();

		sc.close();

		Rectangle rRec1 = new Rectangle(iN);
		rRec1.printRect();
	}

}
