package p534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char cG = sc.next().charAt(0);
		
		
		
		if(cG == '6') {
			
		}
		
		
		

		int iG = (int) cG;

		switch (iG) {

		case 65:
			System.out.println("Excellent");
			break;

		case 66:
			System.out.println("Good");
			break;

		case 67:
			System.out.println("Usually");
			break;

		case 68:
			System.out.println("Effort");
			break;

		case 70:
			System.out.println("Failure");
			break;

		default:
			System.out.println("error");
		}

		System.out.println();

		if (cG == 'A') {
			System.out.println("Excellent");
		} else if (cG == 'B') {
			System.out.println("Good");
		} else if (cG == 'C') {
			System.out.println("Usually");
		} else if (cG == 'D') {
			System.out.println("Effotr");
		} else if (cG == 'F') {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}

		sc.close();

	}

}
