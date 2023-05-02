package p9041;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.printf("점수를 입력하세요.");

			int iScore = sc.nextInt();

			if (iScore >= 80 && iScore <= 100) {
				System.out.printf(" 축하합니다. 합격입니다.%n");
			} else if (iScore > 0 && iScore < 80) {
				System.out.printf(" 죄송합니다. 불합격입니다.%n");
			} else {
				sc.close();
				break;
			}

		}

	}

}
