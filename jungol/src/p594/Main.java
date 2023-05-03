package p594;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sStr = sc.next();
		
		String sStr1 = "";
		sc.close();
		
		for(int i = 0; i < 10; i++) {
			sStr1 += sStr;
		}
		
		System.out.println(sStr1);
	}

}
