package jdbcFile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteDemo {
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
				/*boolean b=s.execute("insert into student values"
						+ "(1011,'barage')");
				System.out.println(b);
				int i=s.getUpdateCount();
				System.out.println(i);*/
				
				boolean b=s.execute("select * from student");
				System.out.println(b);
				
				if(b) {
					ResultSet rs=s.getResultSet();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+" "+
									rs.getString(2));
					}
				}
								
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
