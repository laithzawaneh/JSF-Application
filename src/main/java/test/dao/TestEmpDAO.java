package test.dao;

import java.util.Date;
import java.util.List;

import bean.Dept;
import bean.Emp;
import dao.EmpDAO;



public class TestEmpDAO {

	public static void main(String[] args) {
//		SampleDateFoemat sdf= new SampleDateFoemat("yyyy-MM-dd HH:mm:ss.SSS");
//		Date now = new Date();
//	    System.out.println(sdf.format(now));
		EmpDAO dao = new EmpDAO();
		
//		delete
		int row = dao.delete(2);
		System.out.println(row + " Deleted");
		
//		insert
		Emp emp =new Emp(1000 ,"Hamzeh",1000);
		emp.setJob("Dev");
		emp.setCommission(10);
		emp.setManager(7788);
		emp.setHireDate(new Date());
		emp.setDept(new Dept(10));
		row = dao.insert(emp);
		System.out.println(row + " Inserted");
		
		
//		update
		emp.setName("HMZ123");
		emp.setSalary(2000);
		row = dao.update(emp);
		System.out.println(row + " UpDated");
		
//		select
		List<Emp> empTable = dao.selectAll();
		System.out.println(empTable);
	}

}
