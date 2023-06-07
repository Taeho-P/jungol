package p613;

import java.util.Scanner;


class StudentInfo {
	String sName = null;
	String sSchool = null;
	String sGrade = null;
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		StudentInfo[] sC = new StudentInfo[2];
//
//		for (int i = 0; i < sC.length; i++) {
//			
//			sC[i] = new StudentInfo();
//			
//			sC[i].sName = sc.next();
//			sC[i].sSchool = sc.next();
//			sC[i].sGrade = sc.next();
//
//			System.out.println("Name : " + sC[i].sName);
//			System.out.println("School: " + sC[i].sSchool);
//			System.out.println("Grade : " + sC[i].sGrade);
//			System.out.println();
//
//		}
//
		StudentInfo sA = new StudentInfo();
//		StudentInfo sB = new StudentInfo();

		sA.sName = sc.next();
		sA.sSchool = sc.next();
		sA.sGrade = sc.next();

//		sB.sName = sc.next();
//		sB.sSchool = sc.next();
//		sB.sGrade = sc.next();
//		
		
		sc.close();

		System.out.println("Name : " + sA.sName);
		System.out.println("School: " + sA.sSchool);
		System.out.println("Grade : " + sA.sGrade);

//		System.out.println();
//		System.out.println("Name : " + sB.sName);
//		System.out.println("School: " + sB.sSchool);
//		System.out.println("Grade : " + sB.sGrade);

	}

}
