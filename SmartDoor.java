public class SmartDoor implements Device, Lockable {
    private String name;
    private boolean isOn = false;
    private boolean isLocked = false;

    public SmartDoor(String name) {
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

    public void lock() {
        isLocked = true;
        System.out.println(name + ": LOCKED");
    };

    public void unlock() {
        isLocked = false;
        System.out.println(name + ": UNLOCKED");
    };

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isLocked() {
        return isLocked;
    }
}
