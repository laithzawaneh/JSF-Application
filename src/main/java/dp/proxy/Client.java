package dp.proxy;

public class Client {

	public static void main(String[] args) {

		Internet internet = new ProxyInternet();
		try {
			internet.connectTO("https://htu.edu.jo");
			internet.connectTO("aaa.com");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
