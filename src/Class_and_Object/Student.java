package Class_and_Object;

/*
 * Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
  Assign the value of roll_no as '2' and that of name
 as "John" by creating an object of the class Student.
 */
public class Student {
String name = "John";
int roll_no = 2;
public static void main(String []args) {
	Student s = new Student();
	System.out.println("Name of Student is: "+s.name);
	System.out.println("Roll no of a student is :"+s.roll_no);
}
}
