package p114;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iA = sc.nextInt();
		int iB = sc.nextInt();

		sc.close();

		System.out.println(++iA + " " + iB--);
		System.out.println(iA + " " + iB);

	}

}
