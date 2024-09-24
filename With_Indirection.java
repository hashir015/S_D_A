interface NotificationSender
{
    void sendNotification(String message, String recipient);
}

class EmailNotification implements NotificationSender
{
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending Email to " + recipient + ": " + message);
    }
}
class SMSNotification implements NotificationSender
{
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}

class PushNotification implements NotificationSender {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending Push Notification to " + recipient + ": " + message);

    }
}

class NotificationService {
    private NotificationSender notificationSender;

    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void notifyUser(String message, String recipient) {
        System.out.println("Preparing notification...");
        notificationSender.sendNotification(message, recipient);
    }
}

public class With_Indirection {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailNotification();
        NotificationService emailService = new NotificationService(emailSender);
        emailService.notifyUser("Your order has been shipped!", "john@example.com");

        NotificationSender smsSender = new SMSNotification();
        NotificationService smsService = new NotificationService(smsSender);
        smsService.notifyUser("Your verification code is 123456", "123-456-7890");

        NotificationSender pushSender = new PushNotification();
        NotificationService pushService = new NotificationService(pushSender);
        pushService.notifyUser("New message received!", "User123");
    }
}
