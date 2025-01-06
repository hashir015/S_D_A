public class HomeAutomationSystem {
    public static void main(String[] args) {

        User user = new User(1, "John Doe", "user@example.com", "password");

        MobileApp mobileApp = new MobileApp("1.0");
        mobileApp.authenticate(user);
        mobileApp.receiveNotification();

        IoTDevice device = new IoTDevice("Device1", "Light", "OFF");
        device.executeCommand("ON");

        CloudInfrastructure cloud = new CloudInfrastructure();
        cloud.processData("Energy usage data");
        cloud.storeUserData(user);

        user.viewEnergyUsage();
    }
}
