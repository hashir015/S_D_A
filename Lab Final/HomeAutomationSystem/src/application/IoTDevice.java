// IoTDevice.java
public class IoTDevice {
    private String deviceId;
    private String type;
    private String status;

    public IoTDevice(String deviceId, String type, String status) {
        this.deviceId = deviceId;
        this.type = type;
        this.status = status;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void executeCommand(String command) {
        System.out.println("Executing command on device " + deviceId + ": " + command);
        this.status = command.equalsIgnoreCase("ON") ? "ON" : "OFF";
        System.out.println("Device status is now: " + status);
    }
}
