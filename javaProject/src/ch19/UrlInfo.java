package ch19;

import java.net.URL;

public class UrlInfo {

	public static void main(String[] args) {
		try {
			//new URL(url주소) url문자열을 URL클래스 형식으로 변환
			URL url = new URL("https://blog.naver.com/wndms1128/222979694428");
			System.out.println("프로토콜 : "+url.getProtocol());
			System.out.println("포트 : "+url.getPort());
			System.out.println("포트 : "+url.getHost());
			System.out.println("포트 : "+url.getFile());
			System.out.println("포트 : "+url.toExternalForm());
		} catch (Exception e) {
			e.printStackTrace();
			
			// TODO: handle exception
		}
	}

}
