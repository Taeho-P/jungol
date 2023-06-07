package p574;

public class MaxInt {
	private int[] iNums;
	
	public MaxInt(int[] iNums) {
		this.iNums = iNums;
	}
	
	int getMax() {
		int iMax = Integer.MIN_VALUE;
		for(int i = 0; i < iNums.length; i++) {
			iMax = iNums[i] > iMax ? iNums[i] : iMax;
		}
		return iMax;
	}
}
