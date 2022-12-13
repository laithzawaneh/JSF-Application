package dp.factory;

public class NotificationFactory {
	public Notification creatNotifiction(String chanel) {

		if (chanel.equalsIgnoreCase("SMS")) {
			return new SMSNotification();
		}

		if (chanel.equalsIgnoreCase("EMAIL")){
			return new EmailNotification();
		}
		
		if (chanel.equalsIgnoreCase("PUSH")){
			return new PushNotifiction();
		}
		return null;
	}

}
