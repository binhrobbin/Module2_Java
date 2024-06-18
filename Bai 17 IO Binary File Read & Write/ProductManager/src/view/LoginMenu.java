package view;

import input.Input;
import service.UserService;

public class LoginMenu {
    private static UserService userService = new UserService();
    public void showLoginMenu(){
        boolean complete = false;
         do {
            System.out.println("---->>> Login Menu <<<----");
            System.out.println("1: Login");
            System.out.println("2: Register");
            System.out.println("3: Forgot password");
             int choice = Input.inputNumber();
            switch (choice) {
                case 1:
                    complete = login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    fogotPassword();
                    break;
                default:
                    System.out.println("... Enter wrong choice");
            }
        }while (!complete);

    }
    public boolean login(){
        String userName;
        String password;
        do {
            System.out.println("---->>> Login <<<----");
            System.out.println("Enter user name: ");
            userName = Input.inputString();
            System.out.println("Enter password: ");
            password = Input.inputString();
        }while (!userService.login(userName,password));
        return true;
    }
    public void register(){
        String newUserName;
        String newPassword;
        String newMobileNumber;
        do {
            System.out.println("---->>> Register <<<----");
            System.out.println("Enter new user name: ");
            newUserName = Input.inputString();
            System.out.println("Enter new password: ");
            newPassword = Input.inputString();
            System.out.println("Enter new mobile number: ");
            newMobileNumber = Input.inputMobileNumber();
        }while (!userService.addAccount(newUserName,newPassword,newMobileNumber));
    }
    public void fogotPassword(){
        String userName;
        String mobileNumber;
        do {
            System.out.println("---->>> Look for password <<<----");
            System.out.println("Enter user name: ");
            userName = Input.inputString();
            System.out.println("Enter your mobile number: ");
            mobileNumber = Input.inputMobileNumber();
        }while (!userService.getPassword(userName,mobileNumber));
    }
}
