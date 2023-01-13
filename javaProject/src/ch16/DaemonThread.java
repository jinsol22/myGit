package ch16;

public class DaemonThread implements Runnable {

	@Override
	public void run() {
		while(true) {//while(true)무한반복이지만 main 스레드가 종료되면 자동종료됨
			System.out.println("데몬 스레드가 실행중입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;//Exeption이 발생되면 while문을 빠져나가도록ㄴ
			}
			
		}//while
	}//run
	
	public static void main(String[] args) {
		Thread th= new Thread(new DaemonThread());
		th.setDaemon(true);//데몬스레드로 설정
		th.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 스레드가 종료됩니다.");
	}

}
