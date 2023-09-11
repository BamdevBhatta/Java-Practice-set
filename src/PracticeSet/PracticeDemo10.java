package PracticeSet;
/*
 * Write a program to swap two numbers
a) using temp variable
b) without temp variable

 */
public class PracticeDemo10 {
public static void main(String[] args) {
	swapValue();

}
static void swapValue() {
	int a = 5;
	int b = 6;
	int temp = 0;
	 temp = a;
	 a = b;
	 b= temp;
	 System.out.println("values of a =" +a+"  value of b ="+b);

}
}
