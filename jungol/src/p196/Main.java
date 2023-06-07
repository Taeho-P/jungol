package p196;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PersonInfo[] pInfos = new PersonInfo[3];

		for (int i = 0; i < pInfos.length; i++) {
			pInfos[i] = new PersonInfo();

			String sName = sc.next();
			String sTel = sc.next();
			String sAddr = sc.next();
			pInfos[i].setName(sName);
			pInfos[i].setTel(sTel);
			pInfos[i].setAddr(sAddr);
		}

		int iA = 0;

		Check: for (int i = 65, j = 95; i < 91; i++, j++) {
			for (int k = 0; k < pInfos.length; k++) {
				if (pInfos[k].getName().charAt(0) == i || pInfos[k].getName().charAt(0) == j) {
					iA = k;
					break Check;
				}
			}
		}
		pInfos[iA].printInfo();

	}
}
