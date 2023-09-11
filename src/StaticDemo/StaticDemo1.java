package StaticDemo;

public class StaticDemo1 {
	int roll_no;
	String name;
	String faculty;
	static String collage_name = "FWU";
	static  void change() {
		collage_name = "Amity";
	}
	void showData() {
		System.out.println("Name: "+name);
		System.out.println("Roll number: "+roll_no);
		System.out.println("Faculty Name: "+faculty);
		System.out.println("Collage name: "+collage_name);
	}

	public static void main(String[] args) {
			StaticDemo1  s1 = new StaticDemo1();
			s1.faculty = "CSIT";
			s1.name = "Bobby";
			s1.roll_no = 0121;
			s1.showData();
			System.out.println();
			StaticDemo1 s2 = new StaticDemo1();
			s2.faculty = "Enginneering";
			s2.name = "Ganesh";
			s2.roll_no = 0122;
			s2.showData();
			System.out.println();
			StaticDemo1.change(); 
			StaticDemo1 s3 = new StaticDemo1();
			s3.faculty = "Management";
			s3.name = "Mahesh";
			s3.roll_no = 0123;
			s3.showData();
			
	}
}
