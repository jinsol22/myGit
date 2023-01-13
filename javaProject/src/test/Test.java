package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("임의의 숫자를 입력하세요");
		int num= sc.nextInt();
		
		while (true) {
			if(num<=10)	{
				System.out.println(num+"입니다.");
				break;
				
			}
			
		}
	}
}