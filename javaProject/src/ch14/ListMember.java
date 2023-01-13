package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {
		//ArrayList<클래스객체> -<Object>대신 만들어 놓은 Member객체를 제너릭 하면 Member에서
		//쓰이는 모든 자료형을 처리할 준비가 가능해짐
		List<Member> list=new ArrayList<>();
		
		Member m1=new Member();
		m1.setName("김철수");
		m1.setUserid("Kim");
		m1.setPasswd("1234");
		m1.setTel("02-1234-5678");
		m1.setEmail("kim@naver.com");
		
		list.add(m1);
	}
}
