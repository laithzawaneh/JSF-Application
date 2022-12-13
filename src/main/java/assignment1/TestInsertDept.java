package assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestInsertDept {

	public static void main(String[] args) {
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			PreparedStatement ps = conn.prepareStatement("insert into dept(deptno,dname,loc)values(?,?,?)");
			ps.setInt(1, 50);
			ps.setString(2, "Laith");
			ps.setString(3, "Amman");
			int rows = ps.executeUpdate();
			System.out.println(rows + " inserted");
			ps.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
