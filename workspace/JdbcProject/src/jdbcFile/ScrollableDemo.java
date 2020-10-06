package jdbcFile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;
@SuppressWarnings("unused")
public class ScrollableDemo {
	public static ResultSet rs;
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection
						("jdbc:mysql://localhost:3306/jdbcProject","root","root");
				PreparedStatement s=con.prepareStatement("select * from student",ResultSet.TYPE_SCROLL_SENSITIVE,
							ResultSet.CONCUR_UPDATABLE);
				rs=s.executeQuery();
//				showForward();
//				showBackward();
//				showFirst();
//				showLast();
//				addRecord();
//				updateRecord(1011, "Extremly boared..");
				deleteRecord(39);
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
					
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static void showForward() throws SQLException {
		rs.beforeFirst();
		try {
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("=======================");
	}
	private static void showBackward() throws SQLException {
		rs.afterLast();
		try {
			while(rs.previous()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=======================");
	}
	private static void showFirst() throws SQLException {
		try {
			if(rs.first()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=======================");
	}
	private static void showLast() throws SQLException {
		try {
			if(rs.last()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=======================");
	}
	private static void addRecord() throws SQLException {
		rs.moveToInsertRow();
		rs.updateInt("rollno",39);
		rs.updateString("name","qwww");
		rs.insertRow();
		rs.moveToCurrentRow();
		System.out.println("==================");
		
	}
	private static void updateRecord(int roll,String name) throws SQLException {
		rs.beforeFirst();
		while(rs.next()) {
			int rn=rs.getInt("rollno");
			if(rn==roll) {
				rs.updateInt("rollno",roll);
				rs.updateString("name",name);
				rs.updateRow();
				rs.moveToCurrentRow();
				System.out.println("==================");
				break;
			}
		}
		
	}
	private static void deleteRecord(int roll) throws SQLException {
		rs.beforeFirst();
		while(rs.next()) {
			int rn=rs.getInt("rollno");
			if(rn==roll) {
				rs.deleteRow();
				rs.moveToCurrentRow();
				System.out.println("==================");
			}
		}
		
	}
}
