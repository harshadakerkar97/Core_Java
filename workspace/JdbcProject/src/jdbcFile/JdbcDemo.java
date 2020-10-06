package jdbcFile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) {
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
				s.execute("create table Student"
						+ "(rollno int primary key,name varchar(35))");
				//closing connection
				con.close();
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
