package view;

import input.Input;
import input.UserValidator;
import model.User;
import service.UserService;

public class LoginMenu {
    private static UserService  userService = new UserService();
    private static RoomManager roomManager = new RoomManager();
    public void showLoginMenu() {

        while (true){
            System.out.println("============ Xin chào ============");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Đăng ký");
            System.out.println("0. Thoát");
            int choice = Input.number();
            switch (choice) {
                case 1:
                    showFormLogin();
                    break;
                case 2:
                    showFormRegister();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("... Nhập sai lựa chọn");
            }
        }
    }
    public void showFormLogin() {
        System.out.println("=========== Đăng nhập ===========");
        System.out.println("Nhập tên tài khoản: ");
        String username = UserValidator.account();
        System.out.println("Nhập mật khẩu: ");
        String password = UserValidator.account();
        User user = new User(username, password);
        if(userService.checkLogin(user)) {
            System.out.println("...Đăng nhập thành công");
            showHome();
        } else {
            System.out.println("...Bạn nhập sai tài khoản!");
        }
    }
    public void showFormRegister(){
        System.out.println("=========== Đăng ký ===========");
        String newUserName;
        do {
            System.out.println("Nhập tên tài khoản: ");
            newUserName = UserValidator.account();
        }while (userService.checkUserName(newUserName));
        System.out.println("Nhập mật khẩu ");
        String newPassword = UserValidator.account();
        System.out.println("Nhập tên của bạn: ");
        String newName = Input.string();
        System.out.println("Nhập tuổi: ");
        int newAge = UserValidator.age();
        System.out.println("Nhập số điện thoại: ");
        String newMobileNumber = UserValidator.mobileNumber();
        System.out.println("Nhập địa chỉ: ");
        String newAddress = Input.string();
        System.out.println("Nhập email: ");
        String newEmail = UserValidator.email();
        User newUser = new User(newUserName,newPassword,newName,newAge,newMobileNumber,newAddress,newEmail);
        userService.register(newUser);
    }
    public void showHome() {
        while (true) {
            System.out.println("=========== Chức năng chính =============");
            System.out.println("1. Quản lý phòng");
            System.out.println("2. Quản lý hóa đơn");
            System.out.println("3. Xem thông tin tài khoản");
            System.out.println("4. Thống kê doanh thu");
            System.out.println("5. Đăng xuất");
            int choice = Input.number();
            switch (choice) {
                case 1:
                    roomManager.showRoomManager();
                    break;
                case 2:
//                    showMenuUser();
                    break;
                case 3:
//                    showMenuUser();
                    break;
                case 4:
//                    userService.logout();
                    return;
                default:
                    System.out.println("...Nhập sai lựa chọn");
            }
        }
    }
}
