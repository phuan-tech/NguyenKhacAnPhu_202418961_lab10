// Nguyễn Khắc An Phú 202418961

public class SmartHomeFacade {
    private final Device light;
    private final Device fan;
    private final Lockable door;

    public SmartHomeFacade(Device light, Device fan, Lockable door) {
        if (light == null || fan == null || door == null) {
            throw new IllegalArgumentException("Thiết bị không hợp lệ");
        }

        this.light = light;
        this.fan = fan;
        this.door = door;
    }

    // Chế độ đi làm 
    public void goToWork() {
        light.turnOff();
        fan.turnOff();
        door.lock();
    };

    // Chế độ đi ngủ
    public void goToSleep() {
        fan.turnOff();
        door.lock();
        light.turnOn();

        int level = HomeConfiguration.getInstance().getNightLightLevel();
        System.out.println("Night light level: " + level + "%");
    };
}
