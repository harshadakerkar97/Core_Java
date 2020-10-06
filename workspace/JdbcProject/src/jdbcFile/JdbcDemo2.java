package jdbcFile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rno=sc.nextInt();
		String name=sc.next();
		try {
			//loading the driver[type-4 of mysql]
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				//creating jdbc connection
				Connection con=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/jdbcProject","root","root");
				//creating query statement
				Statement s=con.createStatement();
				//executing query
				int i=s.executeUpdate("insert into student "
						+ "values(105,'lll')");
				String q="insert into student values("+rno+",'"+name+"')";
				int j=s.executeUpdate(q);
				//closing connection
				con.close();
				System.out.println("Done");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
