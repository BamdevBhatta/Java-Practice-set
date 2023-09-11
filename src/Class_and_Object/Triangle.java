package Class_and_Object;

/*
 * Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 
 * units by creating a class named 
'Triangle' without any parameter in its constructor.

 */
public class Triangle {
static int a ;
static int b ;
static int c ;

Triangle( int x, int y, int z){
a=x;
b=y;
c=z;
}

void area() {
	double area = (b*c)*1/2;
	double perimeter = a+b+c;

	System.out.println("Area of Triangle is: "+area);
	System.out.println("Perimeter of triangle is: "+perimeter);

}
public static void main(String[] args) {
	Triangle t= new Triangle(3,4,5);
	t.area();

	}
}
