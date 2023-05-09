package p9016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("키를 입력하세요. ");
		int iH = sc.nextInt();

		System.out.print("몸무게를 입력하세요. ");
		double iW = sc.nextDouble();

		System.out.print("이름을 입력하세요. ");
		char iN = sc.next().charAt(0);

		sc.close();

		System.out.println("키 = " + iH);
		System.out.printf("몸무게 = %.1f\n", iW);
		System.out.println("이름 = " + iN);

	}

}