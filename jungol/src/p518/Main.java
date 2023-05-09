package p518;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] iNums = new int [3];

		int sum = 0;
		
		for(int i = 0; i < iNums.length; i++) {
			iNums[i] = sc.nextInt();
			sum = sum + iNums[i];
		}
		
		System.out.printf("sum : %d\n", sum);
		System.out.printf("avg : %d", sum / iNums.length);

	}

}
