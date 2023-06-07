package p599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String iS = sc.next();

		sc.close();

		for (int i = 0; i < iS.length(); i++) {
			if ((iS.charAt(i) >= 'a' && iS.charAt(i) <= 'z')) {
				System.out.print((char) (iS.charAt(i) - 32));
			} else if (iS.charAt(i) >= 'A' && iS.charAt(i) <= 'Z') {
				System.out.print(iS.charAt(i));
			}
		}

	}

}
