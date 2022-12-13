package dp.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	private Internet internet = new RealInternet();
	private static List<String> unautherizedSites;

	static {
		unautherizedSites = new ArrayList<String>();
		unautherizedSites.add("aaa.com");
		unautherizedSites.add("bbb.com");
		unautherizedSites.add("ccc.com");
	}

	@Override
	public void connectTO(String serverHost) throws Exception {

		if (unautherizedSites.contains(serverHost.toLowerCase())) {
			throw new Exception("Access Denied: " + serverHost);
		}

		internet.connectTO(serverHost);
	}

}
