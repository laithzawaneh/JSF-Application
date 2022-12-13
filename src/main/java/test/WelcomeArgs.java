package test;
/*
 * @author
 * */
public class WelcomeArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 2) {
			System.out.println("Welcome " + args[0] + " " + args[1]);
		} else if (args.length == 1) {
			System.out.println("Welcome " + args[0]);
		} else {
			System.out.println("welcome");
		}

	}

}
