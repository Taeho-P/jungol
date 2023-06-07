package p614;

import java.util.Scanner;

 class SchoolGrade {
	String school = null;
	int grade = 0;
	
	public SchoolGrade(String s, int g) {
		school = s;
		grade = g;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SchoolGrade1 sg1 = new SchoolGrade1("Jejuelementary", 6);

		String school = sc.next();
		int grade = sc.nextInt();

		SchoolGrade1 sg2 = new SchoolGrade1(school, grade);

		System.out.println(sg1.grade + " grade in " + sg1.school + " School");
		System.out.println(sg2.grade + " grade in " + sg2.school + " School");

		sc.close();

	}

}
