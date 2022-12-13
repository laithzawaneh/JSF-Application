package javacourse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestSelect {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("oracel driver found");
		} catch (ClassNotFoundException e) {
			System.out.println("oracel driver not found");
			e.printStackTrace();
		}
		
		try {
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			System.out.println("connected to oracle");
			PreparedStatement ps=conn.prepareStatement("select empno,ename,sal from emp order by empno" );
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("empno")+" "+rs.getString("ename")+" "+rs.getDouble("sal"));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("error:connected to oracle ");
			e.printStackTrace();
		}
	}

}
