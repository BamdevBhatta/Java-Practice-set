package StaticDemo;

public class StaticDemo4 {
	int roll_number;
	String name;
	static String class1 = "CSIT";
	static String group = "First";
	StaticDemo4(int roll_number, String name){
		this.roll_number = roll_number;
		this.name = name;
	}
	   static void change() {
		class1 = "BSC";
		group = "Physical";
	}

	 void showDetails() {
			System.out.println("Roll Number is: "+roll_number);
			System.out.println("Name of Student is: "+name);
			System.out.println("Class of Student is: "+class1);
			System.out.println("Group of Student is: "+group);
			
	}
	public static void main(String []args) {
		new StaticDemo4(121,"Bobby").showDetails();
		System.out.println();
		new StaticDemo4(122,"Harish").showDetails();
		System.out.println();
		StaticDemo4.change();
		new StaticDemo4(123,"Krishna").showDetails();
		System.out.println();
		new StaticDemo4(125 ,"Mahesh").showDetails();
	}

}
