package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.TrainingCourse;
import database.Database;

public class TriningCourseDAO {
	private Database db = null;
	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	private int row = 0;
	private List<TrainingCourse> trainingCourseTable;

	public List<TrainingCourse> selectAll() {

		trainingCourseTable = new ArrayList<TrainingCourse>();

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"select course_id,course_aname,course_ename,max_student,short_desc,detaliled_desc from training_course");
			rs = ps.executeQuery();
			while (rs.next()) {
				TrainingCourse trainingCourse = new TrainingCourse(rs.getInt("course_id"), rs.getString("course_aname"),
						rs.getString("course_ename"), rs.getInt("max_student"), rs.getString("short_desc"),
						rs.getString("detaliled_desc"));
				trainingCourseTable.add(trainingCourse);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}

		return trainingCourseTable;
	}
	
	/////////////////////////////////////
	public int insert(TrainingCourse trainingCourse) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"insert into TRAINING_COURSE(course_id,course_aname,course_ename,max_student,short_desc,detaliled_desc) values(?,?,?,?,?,?)");
			int counter = 1;
			ps.setInt(counter++, trainingCourse.getCourseId());
			ps.setString(counter++, trainingCourse.getaName());
			ps.setString(counter++, trainingCourse.geteName());
			ps.setInt(counter++, trainingCourse.getMaxStudent());
			ps.setString(counter++, trainingCourse.getShortdesc());
			ps.setString(counter++, trainingCourse.getDetailedDesc());

			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}

		return row;

	}
	
	/////////////////////////////

	public int update(TrainingCourse trainingCourse) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("update TRAINING_COURSE set short_desc = ? where course_id=?");
			int counter = 1;
			ps.setString(counter++, trainingCourse.getShortdesc());
			ps.setInt(counter++, trainingCourse.getCourseId());

			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}

		return row;
	}

	/////////////////////////////////////////////

	public int delete(int id) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("delete from TRAINING_COURSE where course_id = ?");
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
