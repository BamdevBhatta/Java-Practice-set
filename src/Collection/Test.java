package Collection;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.setAddress("Kailali");
		s1.setName("Bobby Bhatta");
		s1.setId(0121);
		Student2 s2 = new Student2();
		s2.setAddress("Kanchanpur");
		s2.setId(0122);
		s2.setName("Hari bhatta");
		s2.setStudent1(s1);
		List<Student2> list = new ArrayList<>();
		list.add(s2);
		Test t1 = new Test();
	}
	void print(Student2 s) {
	System.out.println("Name: "+s.getName());
	System.out.println("Id: "+s.getId());
	System.out.println("Address: "+s.getAddress());
	System.out.println();
	System.out.println("Name: "+s.getStudent1().getAddress());
	System.out.println("Id: "+s.getStudent1().getId());
	System.out.println("Address: "+s.getStudent1().getName());
	}
}
