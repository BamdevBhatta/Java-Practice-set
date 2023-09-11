package All;

public class StaticKeyWordpractice {
	int id;
	String name;
	static String  College = "fwu";
void print() {
	System.out.println(id+" "+name+" "+College);
}
int count = 0;
void display() {
	count++;
	
	System.out.println(count);
}
static void changeczname() {
	College = "Siddanath";
}
public static void main(String[] arg) {
	StaticKeyWordpractice ob1 = new StaticKeyWordpractice();
	ob1.id=4;
	ob1.name = "Ganesh pant";
	ob1.print();
	StaticKeyWordpractice.changeczname();
	StaticKeyWordpractice ob2 = new StaticKeyWordpractice();
	
	ob2.id = 12;
	ob2.name = "bamdev";
	ob2.print();
	StaticKeyWordpractice ob3 = new StaticKeyWordpractice();
	ob3.id = 45;
	ob3.name = " Mahesh";
	ob3.print();
	ob1.display();
	ob2.display();
	ob3.display();
	
}

}
