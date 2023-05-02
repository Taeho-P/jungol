package p516;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double dNum1 = sc.nextDouble();
		double dNum2 = sc.nextDouble();
		char cText = sc.next().charAt(0);
		
		sc.close();
		
		System.out.printf("%.2f%n", dNum1);
		System.out.printf("%.2f%n", dNum2);
		System.out.printf("%s", cText);	
	}

}
