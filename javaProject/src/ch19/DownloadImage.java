package ch19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;



public class DownloadImage {
	public static void main(String[] args) throws MalformedURLException {
		String website="https://store.storeimages.cdn-apple.com/8756/as-images.apple.com/is/store-card-13-mac-nav-202203?wid=200&hei=130&fmt=png-alpha&.v=1664664053235";
		System.out.println("다운로드를 시작합니다.");
		URL url=new URL(website);//url생성
		//byte 배열
		byte[] buffer=new byte[2048];//버퍼용 바이트 배열[2mb]
		// 파일로 저장<=== 프로그램 <=== 서버의 이미지 파일
		//try~with문 (Java 1.7부터 도입)
		//try(리소스 선언부) {}catch(Exception e) {}
		//finally가 없어도 리소스를 자동으로 종료시킴
		try(InputStream in=url.openStream();
				OutputStream out=new FileOutputStream("c:\\test\\test.jpg") {
			int length=0;
			while ((length=in.read(buffer)) != -1) {
				
				System.out.println(length+"바이트를 잃음.");
				out.write(buffer, 0, length);
			}
			System.out.println("다운로드가 완료되었습니다");
			
				}
	}
}
