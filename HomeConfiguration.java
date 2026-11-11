public final class HomeConfiguration {
    private static class Holder {
        private static final HomeConfiguration INSTANCE = new HomeConfiguration();
    }

    private HomeConfiguration() {
    }

    public static HomeConfiguration getInstance() {
        return Holder.INSTANCE;
    }

    private String homeName = "My home";
    private int nightLightLevel = 30;

    public String getHomeName() {
        return homeName;
    }

    public int getNightLightLevel() {
        return nightLightLevel;
    }

    public void setHomeName(String newName) {
        this.homeName = newName;
    }

    public void setNightLightLevel(int newLevel) {
        this.nightLightLevel = newLevel;
    }
}
