package p195;

public class Person {
	private String sName = null;
	private String sTel = null;
	private String sAddr = null;
	
	
	public Person(String n, String t, String a) {
		sName = n;
		sTel = t;
		sAddr = a;
	}
	
	public String getsName() {
		return sName;
	}
	
	public String getsTel() {
		return sTel;
	}

	public String getsAddr() {
		return sAddr;
	}
}
