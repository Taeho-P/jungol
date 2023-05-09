package p532;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double dA = sc.nextDouble();
		double dB = sc.nextDouble();
		
		sc.close();
		
		if(dA >= 4.0 && dB >= 4.0) {
			System.out.println("A");
		} else if(dA >= 3.0 && dB >= 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}

	}

}
