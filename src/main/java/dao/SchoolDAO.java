package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.School;
import database.Database;

public class SchoolDAO {

	private Database db = null;
	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	List<School> schoolTable;
	private int row = 0;

	public List<School> selectAll() {
		schoolTable = new ArrayList<School>();

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("select school_id,school_aname,school_ename from school");
			rs = ps.executeQuery();
			while (rs.next()) {
				School school = new School(rs.getInt("school_id"), rs.getString("school_aname"),
						rs.getString("school_ename"));
				schoolTable.add(school);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}
		return schoolTable;
	}
	///////////////////////////////////////
	
	
	public School selectById(int id) {
		 
		School school = null;
		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("select school_id,school_aname,school_ename from school where school_id=?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				school = new School(rs.getInt("school_id"), rs.getString("school_aname"), rs.getString("school_ename"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}

		return school;
	}
	///////////////////////////////

	public int insert(School school) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("insert into school(school_id,school_aname,school_ename) values(?,?,?)");
			int counter = 1;
			ps.setInt(counter++, school.getSchoolId());
			ps.setString(counter++, school.getaName());
			ps.setString(counter++, school.geteName());

			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}

		return row;

	}
	
	///////////////////////////////////////
	
	public int update(School school) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("update school set school_aname = ?,school_ename = ? where school_id=?");
			int counter = 1;
			ps.setString(counter++, school.getaName());
			ps.setString(counter++, school.geteName());
			ps.setInt(counter++, school.getSchoolId());

			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}

		return row;
	}
	/////////////////////
	public int delete(int id) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("delete from school where school_id = ?");
			ps.setInt(1, id);
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}
		return row;
	}

}
