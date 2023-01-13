package ch16;



public class YieldExam implements Runnable {
	public static void main(String[] args) {
		Thread t = new Thread(new YieldExam());
		t.start();
		for(int i=0; i<5; i++) {
			if(i==3) {
				Thread.yield();
			}
			System.out.println("main 스레드");
		}
		
	}
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("run()에서 실행되는 스레드");
		}
		
	}
}
