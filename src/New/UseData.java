package New;

public class UseData {

	public static void main(String[] args) {
		Data ob = new Data();
		ob.setId(5);
		ob.setName("Bamdev");
       UseData o = new UseData();
       o.print(ob);
	}
	void print(Data o) {
		System.out.println("id = "+o.getId());
		System.out.println("name = "+o.getName());
		
	}

}
