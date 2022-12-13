package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Program;
import bean.University;
import database.Database;

public class ProgramDAO {
	private Database db = null;
	private Connection connection = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	List<Program> programTable;
	private int row = 0;

	public List<Program> selectAll() {
		programTable = new ArrayList<Program>();

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("select school_id,program_id,program_aname,program_ename from program order by school_id");
			rs = ps.executeQuery();

			while (rs.next()) {
				Program program = new Program(rs.getInt("school_id"), rs.getInt("program_id"), rs.getString("program_aname"),
						rs.getString("program_ename"));
				programTable.add(program);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(rs);
			Database.close(ps);
			Database.close(connection);
		}
		return programTable;
	}

	public int insert(Program program) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement(
					"insert into program(school_id,program_id,program_aname,program_ename) values(?,?,?,?)");
			int counter = 1;
			ps.setInt(counter++, program.getSchoolId());
			ps.setInt(counter++, program.getProgramlId());
			ps.setString(counter++, program.getaName());
			ps.setString(counter++, program.geteName());

			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}

		return row;

	}
	
	//////////////////////
	public int update(Program program) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("update university set school_id = ? where program_id=?");
			int counter = 1;
			ps.setInt(counter++, program.getSchoolId());
			ps.setInt(counter++, program.getProgramlId());

			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Database.close(ps);
			Database.close(connection);
		}

		return row;
	}
	
	////////////////////////////////
	
	public int delete(int id) {

		try {
			db = new Database();
			connection = db.getConnection();
			ps = connection.prepareStatement("delete from prgram where program_id = ?");
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
