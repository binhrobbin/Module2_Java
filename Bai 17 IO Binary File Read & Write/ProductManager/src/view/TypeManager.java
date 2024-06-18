package view;

import input.Input;

public class TypeManager {
    public static String showType(){
        while (true) {
            System.out.println("---->>> Types <<<----");
            System.out.println("1: mobile");
            System.out.println("2: laptop");
            System.out.println("3: car");
            System.out.println("Enter your choice: ");
            int choice = Input.inputNumber();
            if (choice == 1) return "mobile";
            else if (choice == 2) return "laptop";
            else if (choice == 3) return "car";
            else System.out.println("... Enter wrong choice");
        }
    }
}
