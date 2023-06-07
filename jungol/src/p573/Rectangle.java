package p573;

public class Rectangle {
	private int iNum;
	
	Rectangle(int iNum) {
		this.iNum = iNum;
	}
	
	void printRect() {
		for(int i = 0; i < iNum; i++) {
			int iSn = i * iNum + 1;
			for(int j = iSn; j < iSn + iNum; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
