package p633;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.println("number? ");

			int iC = sc.nextInt();

			if (iC < 1 || iC > 4) {
				System.out.print("none");
				sc.close();
				break;
			}

			switch (iC) {
			case 1:
				System.out.println("Seoul");
				break;

			case 2:
				System.out.println("Washington");
				break;

			case 3:
				System.out.println("Tokyo");
				break;

			case 4:
				System.out.println("Beijing");
				break;
			}
			System.out.println();
		}
	}
}
