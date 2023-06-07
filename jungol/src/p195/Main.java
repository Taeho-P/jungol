package p195;

import java.util.Scanner;

class Person1 {
	private String sName = null;
	private String sTel = null;
	private String sAddr = null;
	
	
	public Person1(String n, String t, String a) {
		sName = n;
		sTel = t;
		sAddr = a;
	}
	
	public String getsName() {
		return sName;
	}
	
	public String getsTel() {
		return sTel;
	}

	public String getsAddr() {
		return sAddr;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Person1[] pInfo = new Person1[1];

		for (int i = 0; i < pInfo.length; i++) {
			String sN = sc.next();
			String sT = sc.next();
			String sA = sc.next();

			pInfo[i] = new Person1(sN, sT, sA);

			System.out.println("name : " + pInfo[i].getsName());
			System.out.println("tel : " + pInfo[i].getsTel());
			System.out.println("addr : " + pInfo[i].getsAddr());
		}

		sc.close();
	}

}
