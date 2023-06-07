package p595;

public class Main {

	public static void main(String[] args) {
		String sN = "Hong Gil Dong";
		
		for(int i = 3; i < 7; i++) {
			System.out.print(sN.charAt(i));
		}
		System.out.println();
		System.out.printf("%s%s%s%s", sN.charAt(3), sN.charAt(4), sN.charAt(5), sN.charAt(6));
	}

}
