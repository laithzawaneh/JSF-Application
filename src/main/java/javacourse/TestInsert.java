package javacourse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestInsert {

	public static void main(String[] args) {

		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			PreparedStatement ps = conn
					.prepareStatement("insert into emp(empno,ename,sal,job,mgr,comm,deptno)values(?,?,?,?,?,?,?)");
			ps.setInt(1, 3);
			ps.setString(2, "Laith"); 
			ps.setDouble(3, 1000.0);
			ps.setNString(4, "Progr");
			ps.setInt(5, 123);
			ps.setInt(6, 400);
			ps.setInt(7, 10);
			
			int rows = ps.executeUpdate();
			System.out.println(rows + " inserted");

			ps.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
