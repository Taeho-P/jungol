package p524_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iA = sc.nextInt();
		int iB = sc.nextInt();

		sc.close();

		String sA = iA > iB ? "A" : "B";
		
		boolean bA = (iA != 0 && iB != 0);
		boolean bB = (iA != 0 || iB != 0);

		System.out.print(bA + " " + bB);
		

	}

}
