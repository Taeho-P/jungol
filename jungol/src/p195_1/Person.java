package p195_1;

public class Person {
	private String name;
	private String tel;
	private String addr;

	public Person() {
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
}
