package Collection;

public class Data {
private int id;
private String name;
private String address;
private char grade;
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
/**
 * @return the grade
 */
public char getGrade() {
	return grade;
}
/**
 * @param grade the grade to set
 */
public void setGrade(char grade) {
	this.grade = grade;
}
@Override
public String toString() {
	return "Data [id=" + id + ", name=" + name + ", address=" + address + ", grade=" + grade + "]";
}

}
