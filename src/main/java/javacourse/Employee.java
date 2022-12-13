package javacourse;



public class Employee {
	private int id;
	private String name;
	private double salary;
	
//	public Employee() {
//		// Connect to DB, Select 
//	}
	
	public Employee() {
		this.id=199;
		this.name="Enter your name";
		this.salary=500;
	}
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	

	public int getId() {
		return id;
	}
/**
 * this method use to set id from main method
 * @param id
 */
	public void setId(int id) {
		this.id = id;
	}
/**
 * 
 * @return name 
 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name
	 */

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {

		Employee that = (Employee) obj;
		if (this.id == that.id) {
			return true;
		} else {
			return false;
		}

	}

}
