package ch10;

public class StaticVar2 {
	static int total;//0,공용 메모리 공간
	String model;//소나타(100번지),모닝(200번지),아반떼(300번지)
	public StaticVar2(String model) {//생성자
		this.model=model;
		total++;//0에서 1 증가
	}
		
}
