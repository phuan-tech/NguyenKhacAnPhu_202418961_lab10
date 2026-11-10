public class DeviceFactory {
    public static Device create(String type, String name) {
        return switch(type.trim().toLowerCase()) {
            case "light" -> new SmartLight(name);
            case "fan" -> new SmartFan(name);
            case "door" -> new SmartDoor(name);
            default -> throw new IllegalArgumentException("Unsupported device type: " + type);
        };
    }
}
