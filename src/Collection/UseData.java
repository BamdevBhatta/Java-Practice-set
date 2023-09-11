package Collection;

public class UseData {
	public static void main(String[] args) {
		Data []d1 = new Data[3];
		for(int i=0;i<d1.length;i++) {
			d1[i] = new Data();
			d1[i].setAddress("Null");
			d1[i].setId(0121);
			d1[i].setGrade('A');
			d1[i].setName("Bamdev");
		}
		for(Data x:d1) {
			System.out.println(x);
		}

	}
}
