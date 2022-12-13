package javacourse;

import java.util.ArrayList;


public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList vl = new ArrayList();
		ArrayList vs = new ArrayList();
		ArrayList<String> vstring=new ArrayList<String>();
		ArrayList<Employee> vemp=new ArrayList<Employee>();

		vs.add("Hamzeh");
		vs.add("Asefan");

		vl.add(1);
		vl.add(vs);
		vl.add(1000.0);

		System.out.println(vl);
		System.out.println(vl.get(0));
		System.out.println(((ArrayList) vl.get(1)).get(1));
		////////////////////////////////
		
		vstring.add("Hamzeh");
		vstring.add("Ali");
		System.out.println(vstring);
		
		////////////////////////////////////
		
		Employee e1 =new Employee(1,"sami",750.0);
		Employee e2 =new Employee(1,"Hamzeh",1000.0);
		
		vemp.add(e1);
		vemp.add(e2);
		System.out.println(vemp);
	}

}
