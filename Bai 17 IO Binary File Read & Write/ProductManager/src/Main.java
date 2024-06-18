import service.UserService;
import view.AccountManager;
import view.LoginMenu;
import view.Manager;
import view.ProductMenu;

public class Main {
    public static void main(String[] args) {
        ProductMenu productMenu = new ProductMenu();
        AccountManager accountManager= new AccountManager();
        LoginMenu loginMenu = new LoginMenu();
        int choice;
        do {
            loginMenu.showLoginMenu();
            do {
                choice = Manager.showManager();
                if (choice == 1) accountManager.showAcountManager();
                else if (choice == 2) productMenu.showProductMenu();
            } while (choice != 0);
        }while (UserService.staticUserIndex == -1);
    }
}
