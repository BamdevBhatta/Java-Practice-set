package Class_and_Object;

/*
 * Assign and print the roll number, phone number and address of two students having names
 *  "Sam" and "John" respectively by creating two objects of class 'Student'.


 */
public class Student1 {
int roll_number;
long phone_number;
String name;

public static void main(String[]args) {
	Student1 s1 = new Student1();
      s1.name ="Sam";
      s1.roll_number = 023;
      s1.phone_number = 98402381;
      
	System.out.println("Name of Student is: "+s1.name);
	System.out.println("Roll number  :"+s1.roll_number);
	System.out.println("Phone number is:"+s1.phone_number);
	Student1 s2 = new Student1();
	s2.name = "John";
	s2.roll_number = 024;
	s2.phone_number = 434343497;
	System.out.println("Name of Student is: "+s2.name);
	System.out.println("Roll number  :"+s2.roll_number);
	System.out.println("Phone number is:"+s2.phone_number);
}
}
