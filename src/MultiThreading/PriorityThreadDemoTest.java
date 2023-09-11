package MultiThreading;

public class PriorityThreadDemoTest extends Thread {
	@Override
	public void run() {
		System.out.println("Thread First  "+Thread.currentThread().getName());
		System.out.println("Priority "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		PriorityThreadDemoTest t1= new PriorityThreadDemoTest();
		PriorityThreadDemoTest t2 = new PriorityThreadDemoTest();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}
}
