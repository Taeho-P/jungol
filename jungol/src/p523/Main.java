package p523;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iA = sc.nextInt();
		int iB = sc.nextInt();

		sc.close();

		boolean bT = iA < iB;
		boolean bT1 = false;

		bT1 = iA == iB ? bT : !bT;

		System.out.println(iA + " > " + iB + " --- " + bT1);
		System.out.println(iA + " < " + iB + " --- " + bT);
		
		boolean bF = iA <= iB;
		boolean bF1 = false;

		bF1 = iA == iB ? bF : !bF;

		System.out.println(iA + " >= " + iB + " --- " + bF1);
		System.out.println(iA + " <= " + iB + " --- " + bF);
	}

}
