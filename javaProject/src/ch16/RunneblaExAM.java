package ch16;

public class RunneblaExAM	implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<100; i++) {
		System.out.println(Thread.currentThread().getName()+"==>"+i);
		
		}
	}//end run()
	public static void main(String[] args) {
		RunneblaExAM e1 = new RunneblaExAM();
		//Runnable을 쓸 때는 Thread를 별도로 생성해서 써야한다.
		//Java는 단일 상속만을 하기 때문에 다른객체와 함계 상속받아 스레드를 구현하려면 Implements Runnable롤 처리
		//new Thread(스레드 구현 객체, "스레드 이름")
		Thread t1 = new Thread(e1, "스레드1");
		Thread t2 = new Thread(e1, "스레드2");
		
		t1.start();//run()호출
		t2.start();
		
	}
}
