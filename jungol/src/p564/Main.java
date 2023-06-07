package p564;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] cAlp = new char[100];
		int[] iCnt = new int[26];

		for (int i = 0; i < cAlp.length; i++) {
			cAlp[i] = sc.next().charAt(0);
			if (!(cAlp[i] >= 'A' && cAlp[i] <= 'Z')) {
				sc.close();
				break;
			}
			
		}
		for (int i = 0; i < cAlp.length; i++) {
			if (!(cAlp[i] >= 'A' && cAlp[i] <= 'Z')) {
				sc.close();
				break;
			}
			for (int j = 65, k = 0; j <= 90; j++, k++) {
				if ((int) cAlp[i] == j) {
					iCnt[k]++;
				}
			}
		}
		for (int j = 65, k = 0; j <= 90; j++, k++) {
			if (!(iCnt[k] == 0)) {
				System.out.println((char) j + " : " + iCnt[k]);
			}
		}
	}
}
