package p531;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double dW = sc.nextDouble();

		int iN = 0;

		if (dW > 88.45) {
			iN = iN + 1;
		} else if (dW > 72.57) {
			iN = iN + 2;
		} else if (dW > 61.23) {
			iN = iN + 3;
		} else if (dW > 50.80) {
			iN = iN + 4;
		} else {
			iN = iN + 5;
		}

		sc.close();

		switch (iN) {
		case 1:
			System.out.println("Heavyweight");
			break;
		case 2:
			System.out.println("Cruiserweight");
			break;
		case 3:
			System.out.println("Middleweight");
			break;
		case 4:
			System.out.println("Lightweight");
			break;
		case 5:
			System.out.println("Flyweight");
			break;
		}

	}

}
