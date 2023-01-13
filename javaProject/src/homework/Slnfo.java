package homework;

public class Slnfo implements Student {
	String name="홍길동";
	String ad="서울 강남구";
	String email="hong@gmail.com";
	int kor=90 , eng=85 , mat=79;
	int tot=kor+eng+mat;
	double avg=tot/3.0;

	@Override
	public void address() {
		System.out.println("===================================");
		System.out.println("이름\t주소\t이메일");
		System.out.println(name+"\t"+ad+"\t"+email);
		System.out.println("-----------------------------------");
	
	}

	@Override
	public void point() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
		System.out.println("========================================");
		

	}

}
