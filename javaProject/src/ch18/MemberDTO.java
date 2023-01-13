package ch18;

import java.io.Serializable;

//객체 직렬화를 하려면 Serializable 인터페이스를 구현해야 함
//객체 직렬화는 메모리에 저장된 객체를 파일로 저장되거나 네트워크로 전송할 때 사용

//MVC패턴에서 쓰이는 용어
//1)DTO : Data Transfer Object(데이터를 전달하는 객체, 결과물을 저장)
//2)VO : Value Object, DTO의 개념이지만 생성자 없이 getter,setter로만 구성됨
//3)DAO : Data Access Object(데이터 조작 객체, DB와 연결해서 데이터를 구하는 비지니스로직단)

public class MemberDTO implements Serializable {
	private String userid;
	private String name;
	private String passwd;
	private int age;
	private String email;
	//생성자2개, getter,setter,toString()
	public MemberDTO(String userid, String name, String passwd, int age, String email) {
		super();
		this.userid = userid;
		this.name = name;
		this.passwd = passwd;
		this.age = age;
		this.email = email;
	}
	
}
