package Class_and_Object;

/*
 * Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by 
 * creating a class named 'Rectangle' with a method named 'Area' which returns the area and length and 
 * breadth passed as parameters to its constructor.
 */
public class Rectangle {
	int length;
	int breadth;
	Rectangle( int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	void area() {
		System.out.println("Area of rectangle is:"+length*breadth);
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,5);
		r1.area();
		Rectangle r2 = new Rectangle(5,8);
		r2.area();
		
	}
}
