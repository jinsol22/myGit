package ch01;

public class For {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 20) {
			if(i % 5 ==0) {
			System.out.println(i + ": 5의 배수입니다.");
		}else {
			System.out.println(i + ": 5의 배수가 아닙니다.");
		}
		i++;
	
		}
	}
}