package test;



import javacourse.FullTimeEmployee;
import javacourse.PartTimeEmployee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee(4, "sami", 750.0);
		Employee e11 = new Employee(4, "sami", 750.0);
		PartTimeEmployee e5 = new PartTimeEmployee();
		FullTimeEmployee e6 =new FullTimeEmployee();


		e1.setId(1);
		e1.setName("laith");
		e1.setSalary(50000);

		e2.setId(5);
		e2.setName("ahmad");
		e2.setSalary(40000);
		
		e5.setId(5);
		e5.setName("abc");
		e5.setSalary(800);
		e5.setHour(4);
		
		e6.setId(6);
		e6.setName("zyz");
		e6.setSalary(1500);
		e6.setVacation(7);

		System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getSalary());
		System.out.println(e2.getId() + " " + e2.getName() + " " + e2.getSalary());
		System.out.println(e3.getId() + " " + e3.getName() + " " + e3.getSalary());
		System.out.println(e4.getId() + " " + e4.getName() + " " + e4.getSalary());
		System.out.println("_________________________________________");
		System.out.println(e4);
		System.out.println(e11);
//		System.out.println(e2.toString());
//		System.out.println(e3);
//		System.out.println(e4);

		if (e4.equals(e11)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

		System.out.println(e5.getId() + " " + e5.getName() + " " + e5.getSalary() + " " + e5.getHour());
		System.out.println(e6.getId() + " " + e6.getName() + " " + e6.getSalary() + " " + e6.getVacation());

	}

}
