package p533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char cS = sc.next().charAt(0);
		int iA = sc.nextInt();

		if (cS == 'M') {
			if (iA >= 18) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
		} else if (iA >= 18) {
			System.out.println("WOMAN");
		} else {
			System.out.println("GIRL");
		}
		sc.close();
	}

}
