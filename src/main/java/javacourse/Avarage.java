package javacourse;

public class Avarage {

	public static void main(String[] args) {
		// ["99","94","91","96","95"]

		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			System.out.println("Mark " + (i + 1) + ": " + args[i]);
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("-------------");
		System.out.println("sum = " + sum + " Avrage = " + sum / args.length);
		
		Math.abs(-10);
	}
}
