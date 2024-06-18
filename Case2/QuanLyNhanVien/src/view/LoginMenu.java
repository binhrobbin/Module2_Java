package view;

import input.Input;
import input.UserValidator;
import model.User;
import service.EmployeeService;
import service.UserService;

public class LoginMenu {
    private static UserService userService = new UserService();
    private static UserManager userManager = new UserManager();
    private static EmployeeManager employeeManager = new EmployeeManager();
    private static EmployeeService employeeService = new EmployeeService();
    public void showLoginMenu() {
        while (true){
            System.out.println("============ XIN CHÀO ============");
            System.out.println("1. Đăng nhập");
            System.out.println("0. Thoát");
            int choice = Input.number();
            switch (choice) {
                case 1:
                    showFormLogin();
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
            if (userService.checkPermision(user)) showHome();
            else showHomeE();
        } else {
            System.out.println("...Bạn nhập sai thông tin!");
        }
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
    public void showHomeE() {
        while (true) {
            System.out.println("=========== Chức năng chính ============");
            System.out.println("1. Quản lý tài khoản");
            System.out.println("2. Điểm danh");
            System.out.println("0. Đăng xuất");
            int choice = Input.number();
            switch (choice) {
                case 1:
                    userManager.showAcountManager();
                    break;
                case 2:
                    employeeService.changeStatusE(userService.findByID(UserService.currentUser.getId()));
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
