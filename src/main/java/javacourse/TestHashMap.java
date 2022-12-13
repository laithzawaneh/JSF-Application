package javacourse;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {

		HashMap<String, String> capitalcities = new HashMap<String, String>();

		capitalcities.put("Jordan", "Amman");
		capitalcities.put("Palistine", "Alqudes");
		capitalcities.put("Iraq", "Baghdad");
		capitalcities.put("Lebanon", "Birout");

		System.out.println(capitalcities);
		System.out.println(capitalcities.entrySet());
		System.out.println(capitalcities.keySet());
		System.out.println(capitalcities.values());
		System.out.println(capitalcities.get("Iraq"));
		System.out.println(capitalcities.remove("Iraq"));
		System.out.println(capitalcities);

	}

}
