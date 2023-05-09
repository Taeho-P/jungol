package p556;

public class Main {

	public static void main(String[] args) {
		int[] iNum = new int[10];

		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = i + 1;
			
			System.out.print(iNum[i]);
			
			if (i < iNum.length - 1) {
				System.out.print(" ");
			}

		}

	}

}
