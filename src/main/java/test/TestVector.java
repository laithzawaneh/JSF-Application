package test;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vl = new Vector();
		Vector vs = new Vector();
		Vector<String> vstring = new Vector<String>();
		Vector<Employee> vemp = new Vector<Employee>();

		vs.add("laith");
		vs.add("zawaneh");

		vl.add(100);
		vl.add(vs);
		vl.add(1);

		System.out.println(vs);
		System.out.println(vl);

		vstring.add("Laith");
		vstring.add("Ahmad");
		System.out.println(vstring);

		Employee e1 = new Employee(1, "laith", 5025.2);
		Employee e2 = new Employee(2, "Ahmad", 552.0);
		vemp.add(e1);
		vemp.add(e2);
		System.out.println(vemp);

	}

}
