package view;

import input.Input;
import service.UserService;

public class Manager {
    public static int showManager(){
        int choice;
        while (UserService.staticUserIndex != -1){
            System.out.println("---->>> MANAGER <<<----");
            System.out.println("1: Account manager");
            System.out.println("2: Product menu");
            System.out.println("3: Exit");
            choice= Input.inputNumber();
            if (choice == 1) return 1;
            else if (choice == 2) return 2;
            else if (choice == 3) return 0;
            else   System.out.println("... Enter wrong choice");
        }return 0;
    }
}
