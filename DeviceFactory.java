// Nguyễn Khắc An Phú 202418961

public class DeviceFactory {
    // Tạo thiết bị
    public static Device create(String type, String name) {
        // Kiểm tra kiểu thiết bị
        if (type == null || type.isBlank()) {
            throw new IllegalArgumentException("Kiểu thiết bị không được rỗng");
        }

        return switch(type.trim().toLowerCase()) {
            case "light" -> new SmartLight(name);
            case "fan" -> new SmartFan(name);
            case "door" -> new SmartDoor(name);
            default -> throw new IllegalArgumentException("Unsupported device type: " + type);
        };
    }
}
