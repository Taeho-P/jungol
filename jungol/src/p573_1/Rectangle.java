package p573_1;

public class Rectangle {
	private int width;

	public Rectangle() {
		width = 0;
	}

	public void setWidth(int width) {
		if (0 < width || 100 > width) {
			this.width = width;
		}
	}

	public int getWidth() {
		return this.width;
	}

	public void printR() {
		for (int i = 0; i < getWidth(); i++) {
			int iSn = i * getWidth() + 1;
			for (int j = iSn; j < iSn + getWidth(); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
