package dp.singleton;

public class Client {

	public static void main(String[] args) {
		
		ApplicationConfigration config1=ApplicationConfigration.getInstance();
		ApplicationConfigration config2=ApplicationConfigration.getInstance();
		
		System.out.println("Config 1: User--> "+config1.get("user"));
		System.out.println("Config 2: User--> "+config2.get("user"));
		System.out.println("Config 1: User-->"+config2.get("host"));
		
		config1.update("password", "tiger#2022");
		System.out.println("Config 1: password--> "+config2.get("password"));
		System.out.println("Config 2: password--> "+config2.get("password"));
	}

}
