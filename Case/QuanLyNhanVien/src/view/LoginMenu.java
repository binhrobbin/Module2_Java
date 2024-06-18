package view;

import input.Input;
import input.UserValidator;
import model.User;
import service.UserService;

public class LoginMenu {
    private static UserService userService = new UserService();
    private static UserManager userManager = new UserManager();
    private static EmployeeManager employeeManager = new EmployeeManager();
    public void showLoginMenu() {
        while (true){
            System.out.println("============ Xin chào ============");
            System.out.println("1. Đăng nhập");
            System.out.println("2. Đăng ký");
            System.out.println("3. Quên mật khẩu");
            System.out.println("0. Thoát");
            int choice = Input.number();
            switch (choice) {
                case 1:
                    showFormLogin();
                    break;
                case 2:
                    showFormRegister();
                    break;
                case 3:
                    showFormForgotPass();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("... Nhập sai lựa chọn");
            }
        }
    }
    public void showFormLogin() {
        System.out.println("------------ Đăng nhập ------------");
        System.out.println("Nhập tên tài khoản: ");
        String userName = UserValidator.account();
        System.out.println("Nhập mật khẩu: ");
        String password = Input.string();
        User user = new User(userName, password);
        if(userService.checkLogin(user)) {
            System.out.println("...Đăng nhập thành công");
            showHome();
        } else {
            System.out.println("...Bạn nhập sai thông tin!");
        }
    }
    public void showFormRegister(){
        System.out.println("------------ Đăng ký ------------");
        System.out.println("Nhập id: ");
        int newID = UserValidator.id();
        String newUserName;
        do {
            System.out.println("Nhập tên tài khoản: ");
            newUserName = UserValidator.account();
        }while (userService.checkUserName(newUserName));
        System.out.println("Nhập mật khẩu ");
        String newPassword = Input.string();
        System.out.println("Nhập số điện thoại: ");
        String newMobileNumber = UserValidator.mobileNumber();
        User newUser = new User(newID, newUserName,newPassword,newMobileNumber);
        userService.register(newUser);
    }
    public void showFormForgotPass(){
        System.out.println("------------ Tìm mật khẩu ------------");
        String userName;
        String mobileNumber;
        do {
            System.out.println("Nhập tên tài khoản: ");
            userName = UserValidator.account();;
            System.out.println("Nhập số điện thoại của bạn: ");
            mobileNumber = UserValidator.mobileNumber();
        }while (!userService.getPassword(userName,mobileNumber));
    }
    public void showHome() {
        while (true) {
            System.out.println("=========== Chức năng chính ============");
            System.out.println("1. Quản lý tài khoản");
            System.out.println("2. Quản lý nhân viên");
            System.out.println("3. Quản lý ngày công");
            System.out.println("0. Đăng xuất");
            int choice = Input.number();
            switch (choice) {
                case 1:
                    userManager.showAcountManager();
                    break;
                case 2:
                    employeeManager.showEmployeeManager();
                    break;
                case 3:
                    employeeManager.showWorkdayManager();
                    break;
                case 0:
                    userService.logout();
                    return;
                default:
                    System.out.println("...Nhập sai lựa chọn");
            }
        }
    }
}
