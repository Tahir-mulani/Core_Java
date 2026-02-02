interface Notification
{
	void send(String message);
}
class EmailNotification implements Notification
{
	public void send(String message){
		System.out.println("Email send : "+message);
	}
}
class SMSNotification implements Notification
{
	public void send(String message){
		System.out.println("SMS sent : "+ message);
	}
}
public class NotificationAPP
{
	public static void  main(String x[])
	{
		Notification n = new EmailNotification();
		n.send("Hello User");
			
		 
	}
}