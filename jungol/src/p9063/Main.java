package p9063;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] iNum = new int[5];
		
		for(int i = 0; i < 5; i++) {
			iNum[i] = sc.nextInt();
			
			System.out.printf("%d ", iNum[i]);
		}
	
	}

}
