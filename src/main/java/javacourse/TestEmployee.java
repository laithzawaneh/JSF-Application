 package javacourse;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee(4, "Sami", 750.0);
		Employee e11 = new Employee(1, "Hamzeh", 1000.0);
		PartTimeEmployee e5 = new PartTimeEmployee();
		FullTimeEmployee e6 = new FullTimeEmployee();

		e1.setId(1);
		e1.setName("laith");
		e1.setSalary(1000);

		e2.setId(2);
		e2.setName("Ahmad");
		e2.setSalary(2000);
		
		e5.setHour(5);
		
		e6.setVacation(4);

		System.out.println("id: " + e1.getId() + "\t" + "Name: " + e1.getName() + "\t" + "salary: " + e1.getSalary());
		System.out.println("id: " + e2.getId() + "\t" + "Name: " + e2.getName() + "\t" + "salary: " + e2.getSalary());
		System.out.println("id: " + e3.getId() + "\t" + "Name: " + e3.getName() + "\t" + "salary: " + e3.getSalary());
		System.out.println("id: " + e4.getId() + "\t" + "Name: " + e4.getName() + "\t" + "salary: " + e4.getSalary());
		System.out.println("id: " + e11.getId() + "\t" + "Name: " + e11.getName() + "\t" + "salary: " + e11.getSalary());
		System.out.println("id: " + e5.getId() + "\t" + "Name: " + e5.getName() + "\t" + "salary: " + e5.getSalary()+" Hour : "+e5.getHour());
		System.out.println("id: " + e6.getId() + "\t" + "Name: " + e6.getName() + "\t" + "salary: " + e6.getSalary()+" vaction : "+e6.getVacation());
		

	}

}
