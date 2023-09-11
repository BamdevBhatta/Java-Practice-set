package StaticDemo;

public class StaticDemo3 {
	static int count = 0;

	StaticDemo3() {
		count++;

	}

	void showCount() {
		System.out.println("The value of count is :" + count);
	}

	public static void main(String[] args) {
			new StaticDemo3().showCount();
			new StaticDemo3().showCount();
			new StaticDemo3().showCount();
			new StaticDemo3().showCount();
	}
}
