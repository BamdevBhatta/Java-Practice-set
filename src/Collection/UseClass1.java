package Collection;

public class UseClass1 {
	public static void main(String[] args) {
		Class1[] obj1 = new Class1[2];
		
		for (int i = 0; i<obj1.length; i++) {
			obj1[i] = new Class1();
			obj1[i].setAddress("Attairya");
			obj1[i].setId(0122);
			obj1[i].setName("Bamdev");
		}
		UseClass1 u1 = new UseClass1();
		u1.print(obj1);
//		for(Class1 x:obj1) {
//			System.out.println(x);
//		}
	}
	void print(Class1 []c1) {
		for(int i=0;i<c1.length;i++) {
			System.out.println("Name: "+c1[i].getName());
			System.out.println("Id: "+c1[i].getId());
			System.out.println("Address: "+c1[i].getAddress());
			System.out.println();
		}
	}
}
