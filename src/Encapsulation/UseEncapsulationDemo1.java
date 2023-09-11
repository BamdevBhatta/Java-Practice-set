package Encapsulation;

public class UseEncapsulationDemo1 {
	public static void main(String []args) {
		EncapsulationDemo1 e1 = new EncapsulationDemo1();
		//e1.setId(500);
		e1.setCompany("Dell");
		e1.setPrice(150000);
		e1.setName("Computer");
		//System.out.println(e1);
    	System.out.println(e1.toString());
//		System.out.println("Id :"+e1.getId());
//		System.out.println("Company: "+e1.getCompany());
//		System.out.println("Price : "+e1.getPrice());
//		System.out.println("Name: "+e1.getName());
		}
	
}
