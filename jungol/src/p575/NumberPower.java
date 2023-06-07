package p575;

public class NumberPower {
	private int iNum1;
	private int iNum2;

	public void setINum1(int iNum1) {
		if(iNum1 <= 10) {
			this.iNum1 = iNum1;
		}
	}
	public void setINum2(int iNum2) {
		if(iNum2 <= 10) {
			this.iNum2 = iNum2;
		}
	}

	int getNum() {
		int Num = 1;
		for (int i = 0; i < iNum2; i++) {
			Num *= iNum1;
		}
		return Num;
	}
}
