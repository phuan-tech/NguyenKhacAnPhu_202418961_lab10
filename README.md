# Lab 10: Smart Home Mini

## 1. Factory đang che dấu quyết định thiết kế nào?
Factory đang che dấu kiểu dữ liệu cụ thể và cách nó khởi tạo cụ thể của từng thiết bị đèn, quạt, cửa
## 2. Singleton đảm bảo điều gì, nhưng tạo ra rủi ro nào?
Singleton đảm bảo tạo 1 và chỉ 1 thể hiện của lớp HomeConfiguration nhưng tạo ra rủi ro:
* Tạo nhầm nhiều instance: Nếu cài đặt theo kiểu khởi tạo lười (Lazy Initialization) mà không đồng bộ hóa luồng (thread-safe), hai luồng chạy cùng lúc có thể cùng kiểm tra thấy instance == null và khởi tạo ra 2 đối tượng khác nhau.
* Sai lệch dữ liệu (Data Corruption): Vì mọi nơi đều dùng chung một đối tượng duy nhất, nếu nhiều luồng cùng đọc và ghi vào các thuộc tính bên trong Singleton mà không có cơ chế khóa (lock), dữ liệu sẽ bị ghi đè sai lệch.
## 3. Facade khác Factory ở mục đích chính như thế nào? 
Mục đích chính của Facade là cung cấp một giao diện đơn giản để giao tiếp với một hệ thống phức tạp, che dấu những quy trình phức tạp khỏi client trong bài này thì nó giúp client dễ dàng chuyển ngôi nhà thông minh sang chế độ đi làm và đi ngủ.
Còn mục đích chính của Factory là giúp client khởi tạo đối tượng mà không cần biết cách đối tượng được cài đặt cụ thể trong chương trình.
## 4. Nếu bỏ SmartHomeFacade, client sẽ phải biết thêm những chi tiết nào?
Nếu bỏ SmartHomeFacade, client sẽ phải biết thêm những phương thức được cài đặt trong từng class thiết bị, biết cách gọi hàm cho từng thiết bị riêng biệt.
Và phải biết đối tượng mình nhập vào thuộc kiểu dữ liệu gì để có thể gọi đúng hàm theo từng chế độ.
