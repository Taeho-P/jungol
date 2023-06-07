package p195_1;

import java.util.Scanner;

class PersonInfo {
	private String name;
	private String tel;
	private String addr;

	public PersonInfo() {
		name = "이름을 입력해주세요.";
		tel = "연락처를 입력해주세요.";
		addr = "주소를 입력해주세요.";
	}

	public void setName(String name) {
		if (100 < name.length()) {
			this.name = "이름을 다시 입력해주세요.";
		} else {
			this.name = name;
		}

	}

	public void setTel(String tel) {
		if (100 >= tel.length()) {
			if ('0' <= tel.charAt(0) && '9' >= tel.charAt(0)) {
				this.tel = tel;
			} else {
				this.tel = "연락처를 다시 입력해주세요.";
			}
		} else {
			this.tel = "연락처를 다시 입력해주세요.";
		}

	}

	public void setAddr(String addr) {
		if (100 >= addr.length()) {
			this.addr = addr;
		} else {
			this.addr = "주소를 다시 입력해주세요.";
		}

	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getAddr() {
		return addr;
	}

	public void print() {
		System.out.println("name : " + getName());
		System.out.println("tel : " + getTel());
		System.out.println("addr : " + getAddr());

	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String sName = sc.next();
		String sTel = sc.next();
		String sAddr = sc.next();

		sc.close();

		PersonInfo p1 = new PersonInfo();

		p1.setName(sName);
		p1.setTel(sTel);
		p1.setAddr(sAddr);

		p1.print();
	}

}
