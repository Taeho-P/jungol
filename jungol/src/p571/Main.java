package p571;

import java.util.Scanner;

class Print1 {
	String sS = "~!@#$^&*()_+|";

	void printText() {
		System.out.println(sS);
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iC = sc.nextInt();

		sc.close();

		Print1 pTs = new Print1();

		for (int i = 0; i < iC; i++) {
			pTs.printText();
		}

	}

}
