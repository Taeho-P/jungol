package p573_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iWidth = sc.nextInt();

		sc.close();

		Rectangle rec1 = new Rectangle();

		rec1.setWidth(iWidth);
		rec1.printR();
	}
}
