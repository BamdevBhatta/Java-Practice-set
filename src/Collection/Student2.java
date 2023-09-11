package Collection;

public class Student2 {
	private String name;
	private int id;
	private String address;
	
	private Student1 student1;
	
	/**
	 * @return the student1
	 */
	public Student1 getStudent1() {
		return student1;
	}

	/**
	 * @param student1 the student1 to set
	 */
	public void setStudent1(Student1 student1) {
		this.student1 = student1;
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
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;

	}

//	@Override
//	public String toString() {
//		return "Student2 [name=" + name + ", id=" + id + ", address=" + address + "]";
//	}

}
