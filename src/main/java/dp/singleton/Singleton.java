package dp.singleton;

public class Singleton {
	
	public static Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstnce() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
