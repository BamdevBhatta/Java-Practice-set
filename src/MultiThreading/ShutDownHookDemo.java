package MultiThreading;

public class ShutDownHookDemo {
public static void main(String[] args) {
	Thread t1 = new Thread() {
		@Override
		public void run() {
		System.out.println("shut Down hook call this method");	
		
		}
	};
	Runtime r = Runtime.getRuntime();
	r.addShutdownHook(t1);
	try {
		System.out.println("Press ctrl+c to exit program");
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Calling System exit method");
	System.exit(0);
	System.out.println("After 3 Second");
}
}
