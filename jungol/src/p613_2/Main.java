package p613_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentInfo[] sSt = new StudentInfo[2];
		
		for(int i = 0; i < sSt.length; i++) {
			String name = sc.next();
			String school = sc.next();
			int grade = sc.nextInt();
			
			
			sSt[i] = new StudentInfo(name, school, grade);
			
			System.out.println("Name : " + sSt[i].name);
			System.out.println("Name : " + sSt[i].school);
			System.out.println("Name : " + sSt[i].grade);
		}
		sc.close();
		
//		Songjunhyuk Beolmal 6 ParkTaeho Sunjung 3

	}

}
