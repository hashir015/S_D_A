class NotificationService {
    public void notifyViaEmail(String message, String recipient) {
        System.out.println("Sending Email to " + recipient + ": " + message);
    }

    public void notifyViaSMS(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }

    public void notifyViaPush(String message, String recipient) {
        System.out.println("Sending Push Notification to " + recipient + ": " + message);
    }
}

public class WithoutIndirection {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        notificationService.notifyViaEmail("Your order has been shipped!", "john@example.com");

        notificationService.notifyViaSMS("Your verification code is 123456", "123-456-7890");

        notificationService.notifyViaPush("New message received!", "User123");
    }
}
