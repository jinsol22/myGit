package ch14;

public class Type3<T>{
	T t;
	public Type3() {
		
	}
	public Type3(T a) {//생성자 매개변수를 쓴다면 타입은 위에서 정한 T로 처리해야 한다.
		t=a;
	}
	public void setT(T t) {//메소드도 생성자 매개변수처리와 같다.
		this.t=t;
	}
	public T getT() {
		return t;
	}
	public static void main(String[] args) {
		//인스턴스를 생성할 때 자료형을 결정함 =>제너릭(일반화)이라 함.
		Type3<String> t=new Type3<String>();
		t.setT("Hello");
		System.out.println(t.getT());
		Type3<Integer> t2=new Type3<Integer>();//우변은 데이터아비 생략 가능
		t2.setT(100);
		System.out.println(t2.getT());
		
		Type3<Double> t3=new Type3<Double>(200.5);//생성자 매개변수 활용
		System.out.println(t3.getT());
		
		//<>자료형을 주지 않고 일반적 방법으로 처리시 실행은 됨.
		//내부적으로 모두 Object롤 처리하게되어 메모리 낭비가 심해짐
		Type3 t4= new Type3();
		t4.setT(100.5);
		System.out.println(t4.getT());
		t4.setT("Java");
		System.out.println(t4.getT());
	}

}
