package p196;

	public class PersonInfo {
		private String name;
		private String tel;
		private String addr;
		
		public PersonInfo() {
			name = "이름을 입력해주세요.";
			tel = "연락처를 입력해주세요.";
			addr = "주소를 입력해주세요.";
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public void setAddr(String addr) {
			this.addr = addr;
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
		
		public void printInfo() {
			System.out.println("name : " + name);
			System.out.println("tel : " + tel);
			System.out.println("addr : " + addr);
		}
	}
