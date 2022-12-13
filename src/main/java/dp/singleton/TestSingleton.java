package dp.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton x = Singleton.getInstnce();
		Singleton y = Singleton.getInstnce();
		Singleton z = Singleton.getInstnce();

		System.out.println("x--> " + x);
		System.out.println("y--> " + y);
		System.out.println("z--> " + z);

		if (x == y && y == z) {
			System.out.println("\nThree objects point to the same memory");

		}
	}

}
