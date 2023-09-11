package Encapsulation;

public class EncapsulationDemo1 {
	private static int Id=121;
	 private String name;
	 private String company;
	int price;
	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	} 
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ShowDetails {Id=" + Id + ", name=" + name + ", company=" + company + ", price=" + price + "}";
	}
//	public static void main(String[]args) {
//		EncapsulationDemo1 e1 = new EncapsulationDemo1();
//		e1.setId(500);
//		e1.setName("Ganesh");
//		e1.setCompany("Microsoft");
//		e1.setPrice(400000);
//		System.out.println("Id: "+e1.getId());
//		System.out.println("Name: "+e1.getName());
//		System.out.println("Company: "+e1.getCompany());
//		System.out.println("Price: "+e1.getPrice());
// }
		
}
