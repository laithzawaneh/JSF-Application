package dp.proxy;

public class RealInternet implements Internet {

	@Override
	public void connectTO(String serverHost) throws Exception {
		System.out.println("Connecting to: "+ serverHost);

		Thread.sleep(2000);
		System.out.println("--> connected");
	}

}
