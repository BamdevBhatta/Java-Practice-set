package MultiThreading;

public class JoinMthod  extends Thread  {
	 @Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		JoinMthod t1 = new  JoinMthod();
		JoinMthod t2 = new JoinMthod();
		JoinMthod t3 = new JoinMthod();
		JoinMthod t4 = new JoinMthod();
		
		t1.start();
		t1.join();
		t2.start();
		t3.start();
		t4.start();
		
		


	}
}
