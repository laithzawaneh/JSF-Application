package javacourse;

public class TestString {

	public static void main(String[] args) {
		String name = "Hamzeh";

		System.out.println("length = " + name.length());
		System.out.println("substring :" + name.substring(2, 5));
		System.out.println("char at : " + name.charAt(2));
		System.out.println("index of : " + name.indexOf("m"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());

		if (name.equalsIgnoreCase("HAMZEH")) {
			System.out.println("isequal");
		} else {
			System.out.println("is not equal");
		}
		
		
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev += name.charAt(i);
		}
		System.out.println(rev);
	}

}
