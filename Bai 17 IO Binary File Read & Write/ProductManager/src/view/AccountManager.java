package view;

import input.Input;
import service.UserService;

public class AccountManager {
    private static UserService userService = new UserService();
    public void showAcountManager(){
        int choice;
        while (true){
            System.out.println("---->>> Account Manager <<<----");
            System.out.println("1: Change password account");
            System.out.println("2: Change mobile number");
            System.out.println("3: Logout");
            System.out.println("4: Back");
            choice = Input.inputNumber();
//            if (choice == 1) changePassword();
//            else if (choice == 3) {
//                UserService.staticUserIndex = -1;
//                return;
//            }
//            else if (choice == 4) return;
//            else System.out.println("Enter wrong choice");
            switch (choice) {
                case 1:
                    changePassword();
                    break;
                case 2:
                    changeMobileNumber();
                    break;
                case 3:
                    UserService.staticUserIndex = -1;
                    return;
                case 4:
                    return;
                default:
                    System.out.println("... Enter wrong choice");
            }
        }
    }
    public void changePassword(){
        System.out.println("---- Change password account ----");
        String odlPassword;
        do {
            System.out.println("Enter old password");
            odlPassword = Input.inputString();
        }while(!userService.checkPassword(odlPassword));
        while (true) {
            System.out.println("Enter new password");
            String newPass1 = Input.inputString();
            System.out.println("Confirm new password");
            String newPass2 = Input.inputString();
            if (newPass2.equals(newPass1)) {
                userService.setPass(newPass1);
                break;
            }else System.out.println("... Wrong confirm, Enter again");
        }
    }
    public void changeMobileNumber(){
        System.out.println("---- Change mobile number ----");
        String password;
        do {
            System.out.println("Enter your password");
            password = Input.inputString();
        }while(!userService.checkPassword(password));
            System.out.println("Enter new mobile number");
            String newMobileNumber = Input.inputMobileNumber();
                userService.setMobileNumber(newMobileNumber);
        }
    }

