package view;

import input.Input;
import input.UserValidator;
import service.UserService;

public class UserManager {
    private static UserService userService = new UserService();
    public void showAcountManager(){

        int choice;
        while (true){
            System.out.println("---------- Tài khoản '"+UserService.currentUser.getUserName()+"' ----------");
            System.out.println("1: Thay đổi mật khẩu");
            System.out.println("2: Thay đổi số điện thoại");
            System.out.println("0: Trở lại");
            choice = Input.number();
            switch (choice) {
                case 1:
                    changePassword();
                    break;
                case 2:
                    changeMobileNumber();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("... Nhập sai lựa chọn");
            }
        }
    }
    public void changePassword(){
        System.out.println("------ Thay đổi mật khẩu ------");
        String odlPassword;
        do {
            System.out.println("Nhập mật khẩu cũ");
            odlPassword = Input.string();
        }while(!userService.checkPassword(odlPassword));
        while (true) {
            System.out.println("Nhập mật khẩu mới");
            String newPass1 = Input.string();
            System.out.println("Xác nhận mật khẩu mới");
            String newPass2 = Input.string();
            if (newPass2.equals(newPass1)) {
                userService.changePass(newPass1);
                break;
            }else System.out.println("... Mật khẩu mới không trùng, mời nhập lại");
        }
    }
    public void changeMobileNumber(){
        System.out.println("------ Thay đổi số điện thoại ------");
        String password;
        do {
            System.out.println("Nhập mật khẩu của bạn");
            password = Input.string();
        }while(!userService.checkPassword(password));
        System.out.println("Nhập số điện thoại mới của bạn");
        String newMobileNumber = UserValidator.mobileNumber();
        userService.changeMobileNumber(newMobileNumber);
    }
}
