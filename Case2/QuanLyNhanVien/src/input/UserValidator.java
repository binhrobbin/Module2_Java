package input;

import java.util.Scanner;

public class UserValidator {
    private static Scanner scanner = new Scanner(System.in);
    public static int id(){
        String regex = "[0-9]+";
        while (true){
            String id = scanner.nextLine();
            if (id.matches(regex)){
                return Integer.parseInt(id);
            }else System.out.println("ID có ít nhất 1 ký tự số");
        }
    }
    public static String account(){
        while (true) {
            String regex = "^\\S{3,16}$";
            String account = scanner.nextLine();
            if (account.matches(regex)) return account;
            else System.out.println("Nhập 3-16 kí tự liền chữ hoặc số");
        }
    }

    public static int idAdmin(){
        while (true){
            try {
                String regex = "[0-9]{3,}";
                String age = scanner.nextLine();
                int age2 = Integer.parseInt(age);
                if (age.matches(regex) && age2>=100) return age2;
                else System.out.println("Nhập số nguyên id >= 100");
            }catch (NumberFormatException numberFormatException){
                System.out.println("Nhập số nguyên tuổi >= 100");
            }
        }
    }
}
