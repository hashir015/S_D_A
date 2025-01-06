// MobileApp.java
public class MobileApp {
    private String appVersion;

    public MobileApp(String appVersion) {
        this.appVersion = appVersion;
    }

    public void authenticate(User user) {
        System.out.println("Authenticating user: " + user.getName());
        // Basic check for illustration
        if (user.getEmail().equals("user@example.com") && user.getPassword().equals("password")) {
            System.out.println("User authenticated successfully!");
        } else {
            System.out.println("Authentication failed.");
        }
    }

    public void receiveNotification() {
        System.out.println("New notification received: Check your devices.");
    }
}
