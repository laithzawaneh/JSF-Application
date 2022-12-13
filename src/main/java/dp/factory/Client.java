package dp.factory;

public class Client {

	public static void main(String[] args) {

		NotificationFactory factory=new NotificationFactory();
		
		Notification notification =factory.creatNotifiction("email");
		notification.notifyUser();
		
		notification =factory.creatNotifiction("push");
		notification.notifyUser();
	}

}
