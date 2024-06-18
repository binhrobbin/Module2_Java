package input;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);
    public static int getNumber(){
        while (true){
            try {
                int number = Integer.parseInt(scanner.nextLine());
                return number;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Please Enter Integer Number!");
            }
        }
    }
    public static double getDoubleNumber(){
        while (true){
            try {
                double number = Double.parseDouble(scanner.nextLine());
                return number;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Please Enter Double Number!");
            }
        }
    }
    public static String getString(){
        return scanner.nextLine();
    }
}
