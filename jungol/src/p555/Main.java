package p555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
				
		char[] cText = new char[10];
		
		String sA = "";
		
		for(int i = 0; i < cText.length; i++) {
			cText[i] = sc.next().charAt(0);
			sA = sA + cText[i];
		}
		
		System.out.println(sA);
		sc.close();
//		cText[0] = sc.next().charAt(0);
//		cText[1] = sc.next().charAt(0);
//		cText[2] = sc.next().charAt(0);
//		cText[3] = sc.next().charAt(0);
//		cText[4] = sc.next().charAt(0);
//		cText[5] = sc.next().charAt(0);
//		cText[6] = sc.next().charAt(0);
//		cText[7] = sc.next().charAt(0);
//		cText[8] = sc.next().charAt(0);
//		cText[9] = sc.next().charAt(0);
//		
//		System.out.printf("%c%c%c%c%c%c%c%c%c%c", cText[0], cText[1], cText[2], cText[3], cText[4], cText[5], cText[6], cText[7], cText[8], cText[9]);

	}

}
