package PracticeSet;
//Write a program to find the perimeter of circle, triangle, and rectangle.
//(2pi r,a=a+b+c; p =2(l+b))
public class PracticeProgramDemo5 {
		public static void main(String []args) {
			int r = 4; int  l = 5; int b = 3;
			 double p = Math.PI*2*r;
			System.out.println("Perimeter of Circle is: "+p);
			System.out.println("Perimeter of Triangle is: "+(r+l+b));
			System.out.println("Perimeter of Rectangle: "+(2*(l+b)));
		}
}
