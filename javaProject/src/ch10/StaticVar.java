package ch10;

public class StaticVar {
	static int a=10;//static member
	int b=20;//non-static member
	
	public static void main(String[] args) {
		System.out.println(StaticVar.a);//static은 클래스이름.멤버 이런식으로 작성 가능하다.멤버로 접근가능하다.
		
		StaticVar s = new StaticVar();
		System.out.println(s.b);
	}
}
