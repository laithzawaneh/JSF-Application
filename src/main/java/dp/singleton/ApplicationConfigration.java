package dp.singleton;

import java.util.HashMap;
import java.util.Map;

public class ApplicationConfigration {

	public static ApplicationConfigration instance;
	private Map<String, String> configMap;

	private ApplicationConfigration() {
		configMap = new HashMap<String, String>();
		configMap.put("host", "localhost");
		configMap.put("port", "1521");
		configMap.put("user", "scott");
		configMap.put("password", "tiger");
	}

	public static ApplicationConfigration getInstance() {

		if (instance == null) {
			instance = new ApplicationConfigration();
		}
		return instance;
	}

	public String update(String key, String value) {
		return configMap.put(key, value);
	}

	public String get(String key) {
		return configMap.get(key);
	}
}
