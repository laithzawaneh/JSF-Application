package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import bean.Dept;
import bean.Users;
import database.Database;

public class UsersDAO {
	private Database db = null;
	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private int row = 0;
	private List<Users> usersTable;
	
	public int insert(Users user) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"insert into user_tbl(user_id,first_name,last_name,sex,birthdate,country,email,pwd,sal,mobile) values(?,?,?,?,?,?,?,?,?,?)");
			int counter = 1;
			ps.setInt(counter++, 3);
			ps.setString(counter++, user.getfName());
			ps.setString(counter++, user.getlName());
			ps.setString(counter++, user.getSex());
			ps.setDate(counter++, new Date (user.getDate().getTime()));
			ps.setString(counter++, user.getCountry());
			ps.setString(counter++, user.getEmail());
			ps.setString(counter++, user.getPassword());
			ps.setDouble(counter++, user.getExpectedSalary());
			ps.setString(counter++, user.getMobile());
			

			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}

		return row;

	}
	
	public Users selectByEmail(String email , String password) {
		 
		Users user = null;
		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("select email,pwd from user_tbl where email=? and pwd=?");
			ps.setString(1, email);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				user = new Users(rs.getString("email"), rs.getString("pwd"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}

		return user;
	}
}
