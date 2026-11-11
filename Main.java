public class Main {
    public static void main(String[] args) {
        System.out.println("1. Tạo light, fan, door");
        Device light = DeviceFactory.create("light", "Đèn ngủ");
        Device fan = DeviceFactory.create("fan", "Quạt điện");
        Device door = DeviceFactory.create("door", "Cửa chính");

        System.out.println("Đèn ngủ: " + light.getClass().getName());
        System.out.println("Quạt điện: " + fan.getClass().getName());
        System.out.println("Cửa chính: " + door.getClass().getName());
        System.out.println("Khởi tạo các đối tượng thành công");

        System.out.println("---------------------------------------");

        System.out.println("2. Tạo loại camera khi chưa hỗ trợ");
        try {
            Device camera = DeviceFactory.create("camera", "Máy ảnh");
            System.out.println("Tạo máy ảnh thành công");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi! " + e.getMessage());
        }

        System.out.println("---------------------------------------");

        System.out.println("3. Lấy HomeConfiguration.getInstance() hai lần");
        HomeConfiguration aHome = HomeConfiguration.getInstance();
        HomeConfiguration bHome = HomeConfiguration.getInstance();
        System.out.println("Hiển thị tên của 2 HomeConfiguration khi mới gọi hàm: ");
        System.out.println("aHome name: " + aHome.getHomeName());
        System.out.println("bHome name: " + bHome.getHomeName());
        System.out.println("Chỉ đổi tên của aHome thành My smart home và hiển thị tên của 2 HomeConfiguration sau khi thay đổi: ");
        aHome.setHomeName("My smart home");
        System.out.println("aHome name: " + aHome.getHomeName());
        System.out.println("bHome name: " + bHome.getHomeName());

        System.out.println("---------------------------------------");

        System.out.println("4. Gọi goToWork()");
        SmartHomeFacade smartHome = new SmartHomeFacade(light, fan, (SmartDoor)door);
        smartHome.goToWork();

        System.out.println("---------------------------------------");

        System.out.println("5. Gọi goToSleep()");
        smartHome.goToSleep();
    }
}