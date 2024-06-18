package view;

import input.Input;
import model.User;
import service.UserService;

public class UserMenu {
    private UserService userService = new UserService();
    private StudentMenu studentMenu = new StudentMenu();

    public void showLoginMenu() {
        int choice;
        do {
            System.out.println("============ Welcome My App ============");
            System.out.println("1.Login");
            System.out.println("2.Register");
            System.out.println("0.Exit");
            choice = Input.getNumber();
            switch (choice) {
                case 2:
                    showFormRegister();
                    break;
                case 1:
                    showFormLogin();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("No that choice! Again");
            }
        } while (choice != 0);
    }
    public void showFormRegister() {
        System.out.println("=========== Form Register ============");
        System.out.println("Enter id: ");
        int id = Input.getNumber();
        System.out.println("Enter username: ");
        String username = Input.getString();
        System.out.println("Password: ");
        String password = Input.getString();
        User user = new User(id, username, password);
        userService.register(user);
    }

    public void showFormLogin() {
        System.out.println("======= Form Login ===========");
        System.out.println("Enter Username: ");
        String username = Input.getString();
        System.out.println("EnterPassword: ");
        String password = Input.getString();
        User user = new User(username, password);
        if(userService.checkLogin(user)) {
            showHome();
        } else {
            System.out.println("Username OR Password is Wrong!");
        }
    }

    public void showHome() {
        int choice;
        do {
            System.out.println("=========== Home =============");
            System.out.println("1.Student Manager");
            System.out.println("2.User manager");
            System.out.println("3.Logout");
            choice = Input.getNumber();
            switch (choice) {
                case 1:
                    studentMenu.showMainMenu();
                    break;
                case 2:
                    showMenuUser();
                    break;
                case 3:
                    userService.logout();
                    return;
                default:
                    System.out.println("No that choice! Again");
            }
        } while (choice != 0);
    }

    public void showMenuUser() {
        User currentUser = UserService.currentUser;
        int choice;
        do {
        System.out.println("----->>> User " + currentUser.getUserName() + " <<<-----");
        System.out.println("1.Show Info");
        System.out.println("2.Change Password");
        System.out.println("3.Back");
            choice = Input.getNumber();
            switch (choice) {
                case 1:
                    System.out.println(currentUser);
                    break;
                case 2:
                    showFormChangePass();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("No that choice! Again");
            }
        } while (choice != 0);
    }
    public void showFormChangePass(){
        System.out.println("Enter new password");
        String newPassword = Input.getString();
        userService.changePass(newPassword);
    }
}

