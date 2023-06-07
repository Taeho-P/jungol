package p617;

import java.util.Scanner;

public class PersonInfo {
	private String name;
	private int tall;
	
	public PersonInfo(String name, int tall) {
		this.name = name;
		this.tall = tall;
	}
	
	public int getTall() {
		return tall;
	}
	
	public String getName() {
		return name;
	}
	
}

public class Main {
	
	public static void findSmall (PersonInfo[] person) {
		int iT = Integer.MAX_VALUE;
		int iIndex = 0;
		for(int i = 0; i < person.length; i++) {
			if(person[i].getTall() < iT) {
				iT = person[i].getTall();
				iIndex = i;
			}
		}
		System.out.println(person[iIndex].getName() + " " + person[iIndex].getTall());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PersonInfo[] person = new PersonInfo[5];

		for (int i = 0; i < person.length; i++) {
			String sName = sc.next();
			int iTall = sc.nextInt();
			person[i] = new PersonInfo(sName, iTall);
		}

		sc.close();

		findSmall(person);

	}

}
