package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DataClient {
	public static void main(String[] args) throws Exception{
		Socket s=new Socket("localhost", 7999);
		BufferedReader input=new BufferedReader(new InputStreamReader(s.getInputStream()));
		//서버에서 보내내 메세지를 받음
		String res=input.readLine();
		System.out.println(res);
		s.close();//소켓 닫기
		System.exit(0);//프로그램 종료
		
	}
}
