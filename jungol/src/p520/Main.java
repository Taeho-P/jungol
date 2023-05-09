package p520;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int iA = sc.nextInt();
		
		sc.close();
		
		System.out.println(iA++);
		System.out.println(++iA);
	}
	
}
