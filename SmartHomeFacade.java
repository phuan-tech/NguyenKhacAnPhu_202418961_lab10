public class SmartHomeFacade {
    private final Device light;
    private final Device fan;
    private final Lockable door;

    public SmartHomeFacade(Device light, Device fan, Lockable door) {
        this.light = light;
        this.fan = fan;
        this.door = door;
    }

    public void goToWork() {
        light.turnOff();
        fan.turnOff();
        door.lock();
    };

    public void goToSleep() {
        fan.turnOff();
        door.lock();
        light.turnOn();

        int level = HomeConfiguration.getInstance().getNightLightLevel();
        System.out.println("Night light level: " + level + "%");
    };
}
