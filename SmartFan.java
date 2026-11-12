// Nguyễn Khắc An Phú 202418961

public class SmartFan implements Device {
    private String name;
    private boolean isOn = false;

    public SmartFan(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Tên không được để trống");
        }
        this.name = name;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + ": ON");
    };
    public void turnOff() {
        isOn = false;
        System.out.println(name + ": OFF");
    };

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }
}
