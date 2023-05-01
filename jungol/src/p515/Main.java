package p515;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int iA = sc.nextInt();
		
		int iB = sc.nextInt();

		sc.close();
		
		int iX = iA*iB;
		
		int iY = iA/iB;
		
		System.out.printf("%d * %d = %d", iA, iB, iX);
		System.out.printf("%n%d / %d = %d", iA, iB, iY);
	}

}
