package p519;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int iA = sc.nextInt();
		int iB = sc.nextInt();
		
		sc.close();
		
		iA = iA + 100;
		iB = iB % 10;

		System.out.println(iA + " " + iB);
	}

}
