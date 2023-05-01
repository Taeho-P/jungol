package p530;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iAge = sc.nextInt();
		
		sc.close();
		
		if (iAge >= 20) {
			System.out.print("adult");
		} else {
			System.out.printf("%d years later", 20 - iAge);
		}
		
	}

}
