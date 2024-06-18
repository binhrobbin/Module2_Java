package input;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputChoiceNumber() {
        String regex = "[1-9]";
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (String.valueOf(number).matches(regex)) return number;
                else System.out.println("Please enter the correct option");
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Please enter the number!");
            }
        }
    }
    public static String inputMobileNumber() {
        String regex = "^0[1,3,5,7,8,9][0-9]{8}$";
        while (true) {
            try {
                String str = scanner.nextLine();
                if (str.matches(regex)) return str;
                else System.out.println("Please enter the correct form '0xxxxxxxxx'");
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Please enter the number!");
            }
        }
    }
    public static int inputNumber() {
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                return number;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Please enter the number!");
            }
        }
    }
    public static double inputDoubleNumber() {
        while (true) {
            try {
                double number = Double.parseDouble(scanner.nextLine());
                return number;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Please enter the double number!");
            }
        }
    }
    public static String inputString(){
        while (true) {
            String regex = ".+";
            String str = scanner.nextLine();
            if (str.matches(regex)) return str;
            else System.out.println("Please don't enter space");
        }
    }
}
