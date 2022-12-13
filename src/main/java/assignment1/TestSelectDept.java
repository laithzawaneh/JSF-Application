package assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestSelectDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("connected to oracle");
			PreparedStatement ps=conn.prepareStatement("select * from dept" );
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("deptno")+" "+rs.getString("dname")+" "+rs.getString("loc"));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
