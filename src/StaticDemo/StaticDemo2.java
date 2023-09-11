package StaticDemo;

public class StaticDemo2 {
	int count = 0;

	StaticDemo2() {
		count++;
	}

	void showCount() {
		System.out.println("The value of Count is:" + count);
	}

	public static void main(String[] args) {
		new StaticDemo2().showCount();
		new StaticDemo2().showCount();
		new StaticDemo2().showCount();

	}

}
