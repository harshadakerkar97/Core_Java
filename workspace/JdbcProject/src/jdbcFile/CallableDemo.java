package jdbcFile;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CallableDemo {
	public static void main(String[] args) {
		try {
			int rolno=103;
			String n="harshada";
			//loading the driver[type-4 of mysql]
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				//creating jdbc connection
				Connection con=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/jdbcProject","root","root");
				//creating query statement
				CallableStatement s=con.prepareCall("{ call mypro(?)}");
				s.setInt(1, 106);
				//executing query
				s.execute();
				//closing connection
				con.close();
				System.out.println("Success");
			} catch (SQLException e) {
				e.printStackTrace();
			}
					
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
