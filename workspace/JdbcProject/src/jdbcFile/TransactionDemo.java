package jdbcFile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/jdbcproject","root","root");
			con.setAutoCommit(false);
			Statement s=con.createStatement();
			int i=s.executeUpdate("insert into student values(103,'abcs')");
			con.commit();
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
