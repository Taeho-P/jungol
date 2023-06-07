package p575;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iNum1 = sc.nextInt();
		int iNum2 = sc.nextInt();

		sc.close();

		NumberPower nCase1 = new NumberPower();
		nCase1.setINum1(iNum1);
		nCase1.setINum2(iNum2);

		System.out.println(nCase1.getNum());

	}

}
