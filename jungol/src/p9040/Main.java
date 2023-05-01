package p9040;

public class Main {

	public static void main(String[] args) {
		int num = 1;
		int sum = 1;
		while (num <=10 ) {
			 sum = sum + ++num;
			if (num == 10) {
				num++;
				System.out.printf("1부터 10까지의 합 = %d%nwhile문이 끝난 후의 num의 값 = %d", sum , num);
			}
		}

	}

}
