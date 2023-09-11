package Filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) throws IOException, SQLException {
		FileReader file = new FileReader("d://bway/data.csv");
		BufferedReader br = new BufferedReader(file);
		String line;
		List <Student> list = new ArrayList<>();
		Connection con = jdbc.getconn();
		while ((line = br.readLine()) != null) {
			// System.out.println(line);

			String[] values = line.split(",");
			Student s = new Student();

			s.setId(values[0]);
			s.setName(values[1]);
			s.setPassword(values[2]);

//			int id = Integer.parseInt(s.getId());
//			String name = s.getName();
//			String password = s.getPassword();
////			
			list.add(s);
		}
		for(Student x: list) {
			int   id=Integer.parseInt(x.getId());
			String name = x.getName();
			String  password = x.getPassword();
			String sql = "insert into student1 (sc_no,name,password) values('" + id + "','" + name + "','" + password
					+ "')";
			Statement stm = con.createStatement();
			stm.execute(sql);

		}
		System.out.println(" Statement added success");
		con.close();
		br.close();
	}
}
