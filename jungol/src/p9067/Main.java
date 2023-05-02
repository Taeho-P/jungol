package p9067;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] iNums = new int[10];
		
		for(int i = 0; i < iNums.length; i++) {
			iNums[i] = sc.nextInt();
		}
		sc.close();
		System.out.printf("%d %d %d", iNums[2], iNums[4], iNums[9]);
	}

}
