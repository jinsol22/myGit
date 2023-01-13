package ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExam {
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getByName("google.com");
			System.out.println(address);//호스트 이름과 ip주소
			System.out.println(address.getHostName());//호스트 이름(도메인 이름)
			System.out.println(address.getHostAddress());//ip 주소값만 가져올 수 있다.
		} catch (UnknownHostException e) {//알려지지 않은 호스트
			e.printStackTrace();
		}
		
	}
}
