package ch13;

import java.util.StringTokenizer;

public class StrToken {
	public static void main(String[] args) {
		String str="kim,20,180,55,서울,학생";
		
		String[] items=str.split(",");//콤마를 기준으로 좌우를 분리
		for(String s : items) {
			System.out.println(s);
		}
		//StringTokenizer는 String 객체의 split()등의 메소드를 보다 더 다양한 메소드 들을 제공한다.
		StringTokenizer st=new StringTokenizer(str, ",");
		int cnt=st.countTokens();//토큰의 갯수
		System.out.println("토큰의 갯수 : "+cnt);
		while (st.hasMoreTokens()) {//객체 안 토큰이 하나라도 존재하면 true, 없으면 false를 리턴
			System.out.println(st.nextToken());//개체 안 토큰하나를 가져와 반환
			
		}
		
		
		
	}
}
