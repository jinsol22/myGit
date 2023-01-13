package ch19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;

public class UDPEchoServer {
	public UDPEchoServer(int port) {
		try {
			DatagramSocket ds = new DatagramSocket(port);
			while (true) {
				byte buffer[] = new byte[512];
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				System.out.println("ready");
				//클라이언트가 보낸 메시지를 수신하기 위한 코드
				//소켓을 통해 수신된 클라이언트의 메시지를 DatagramPcaket에 저장
				ds.receive(dp);
				String str  = new String(dp.getData());
				System.out.println("클라이언트에서 보낸 메시지 : " + str);
				
				InetAddress ia = dp.getAddress();//클라이언트측 ip주소 get
				port = dp.getPort();//클라이언트 측 port번호 get
				System.out.println("cilient ip :"+ia+", clinet port : "+port);
				
				//클라이언트에게 전송할 패킷객체 생성
				
				dp = new DatagramPacket(dp.getData(), dp.getData().length, ia,port);
				ds.send(dp);//클라이언트에게 자료 전송
				ds.close();//소켓 닫기
				
			}
		} catch (Exception e) {
			 e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new UDPEchoServer(3000);//서버측 포트번호 세팅
	}
}