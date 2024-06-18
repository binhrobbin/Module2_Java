package view;

import input.Input;
import input.UserValidator;
import model.User;
import service.UserService;

public class UserManager {
    private static UserService userService = new UserService();
    public void showAcountManager(){

        int choice;
        while (true){
            System.out.println("---------- Tài khoản '"+UserService.currentUser.getUserName()+"' ----------");
            System.out.println("1: Thay đổi mật khẩu");
            System.out.println("2: Thêm tài khoản (admin)");
            System.out.println("0: Trở lại");
            choice = Input.number();
            switch (choice) {
                case 1:
                    changePassword();
                    break;
                case 2:
                    if (checkPermission()) showFormRegister();
                    else System.out.println("...Bạn không có quyền truy cập");
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
    public boolean checkPermission(){
        if (UserService.currentUser.getPermission().equals("admin")) return true;
        else return false;
    }
    public void showFormRegister(){
        System.out.println("------------ Đăng ký ------------");
        int newId;
        System.out.println("Nhập ID: ");
        while (true) {
            newId = UserValidator.idAdmin();
            int id = userService.findByID(newId);
            if (id != -1) System.out.println("ID bị trùng, hãy nhập id khác! ");
            else break;
        }
        String newUserName;
        do {
            System.out.println("Nhập tên tài khoản: ");
            newUserName = UserValidator.account();
        }while (userService.checkUserName(newUserName));
        System.out.println("Nhập mật khẩu ");
        String newPassword = Input.string();
        User newUser = new User(newId, newUserName,newPassword,"admin");
        userService.register(newUser);
    }
}
