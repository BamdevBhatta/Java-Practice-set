package StaticDemo;

//this is specially for static block.
/*
 * here we are using static block and execute without creating main method.and this will properly
 * word on program.let's see in the program how it works without main method.
 */
public class StaticDemo5 {
	static {
		System.out.println("Hii !!! this is static block with_out main method");
	}

	public static void main(String[] args) {
		System.out.println("this method only execute when we call main method");
	}
}
