package p9031;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iNum1 = sc.nextInt();
		int iNum2 = sc.nextInt();
		
		if (iNum1 > iNum2) {
			System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다." ,iNum1 , iNum2);
		} else {
			System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다." , iNum2 , iNum1);
		}
	}

}
