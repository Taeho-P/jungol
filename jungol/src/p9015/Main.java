package p9015;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("두 수를 입력하시오. ");
		
		int iA = sc.nextInt();
		int iB = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", iA, iB, iA + iB);
		System.out.printf("%d * %d = %d", iA, iB, iA * iB);

	}

}
