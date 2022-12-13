package test.dao;

import java.util.List;

import bean.Dept;
import dao.DeptDAO;

public class TestDeptDAO {

	public static void main(String[] args) {

		DeptDAO dao = new DeptDAO();
//		delete
		int row =dao.delete(60);
		System.out.println(row + "deleted");
		
//		insert
		Dept dept = new Dept(60,"TEST","AMMAN");
		row = dao.insert(dept);
		System.out.println(row + "Inserted");
		
//		update
		dept =new Dept(50,"Dev","IRBID");
		row =dao.update(dept);  
		System.out.println(row +" updated");

//		select
		List<Dept> deptTable = dao.selectAll();
		System.out.println(deptTable);

	}

}
