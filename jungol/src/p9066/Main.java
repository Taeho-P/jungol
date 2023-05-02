package p9066;

public class Main {

	public static void main(String[] args) {
		
		
		char[] cAlp2 = new char[26];
		
		int iNum = 65;
		
		for(int i = 0; i < 26; i++) {
			cAlp2[i] = (char)iNum;
			iNum++;
		}
		
//		char cAlp[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','G','R','S','T','U','V','W','X','Y','Z'};
		
		for(int i = 25; i > -1; i--) {
		
		System.out.print(cAlp2[i] + " ");
		}
	}

}
