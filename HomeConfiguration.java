// Nguyễn Khắc An Phú 202418961

public final class HomeConfiguration {
    // Inner class
    private static class Holder {
        private static final HomeConfiguration INSTANCE = new HomeConfiguration();
    }

    private HomeConfiguration() {
    }

    // lấy INSTANCE
    public static HomeConfiguration getInstance() {
        return Holder.INSTANCE;
    }

    private String homeName = "My home";
    private int nightLightLevel = 30;

    // lấy tên nhà
    public String getHomeName() {
        return homeName;
    }

    // lấy mức đèn ngủ
    public int getNightLightLevel() {
        return nightLightLevel;
    }

    // set tên nhà
    public void setHomeName(String newName) {
        this.homeName = newName;
    }

    // set mức đèn
    public void setNightLightLevel(int newLevel) {
        this.nightLightLevel = newLevel;
    }
}
