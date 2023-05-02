package p556;

public class Main {

	public static void main(String[] args) {
		int[] iNum = new int[10];

		int x = 1;

		for (int i = 0; i < iNum.length; i++) {
			iNum[i] = x++;
			
			System.out.print(iNum[i]);
			
			if (i < iNum.length - 1) {
				System.out.print("?");
			}

		}

	}

}
