package jdbcFile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo3 {
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
				Statement s=con.createStatement();
				//executing query
				//String q="select * from student where rollno="+rolno+"&& name='harshada'";
				String q="select * from student where name="+'n';
				System.out.println(q);
				ResultSet rs=s.executeQuery(q);
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "
							+rs.getString(2));
				}
				//System.out.println(q);
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
