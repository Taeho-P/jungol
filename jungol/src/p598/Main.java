package p598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		while (true) {

			char cA = sc.next().charAt(0);
			
			
			if (Character.isAlphabetic(cA)) {
				System.out.println(cA);
			} else if (Character.isDigit(cA)) {
				System.out.println((int)cA);
			} else {
				break;
			}
			
			
			
			
			
			//C언어 방식 풀이
			
			if (cA >= 'a' && cA <= 'z' || cA >= 'A' && cA <= 'Z') {
				System.out.println(cA);
			} else if (cA >= '0' && cA <= '9') {
				System.out.println((int) cA);
			} else {
				sc.close();
				break;
			}
		}
	}
}