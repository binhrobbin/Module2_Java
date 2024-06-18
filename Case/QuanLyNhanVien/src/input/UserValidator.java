package input;

import java.util.Scanner;

public class UserValidator {
    private static Scanner scanner = new Scanner(System.in);
    public static int id(){
        String regex = "[0-9]{2,}";
        while (true){
            String id = scanner.nextLine();
            if (id.matches(regex)){
                return Integer.parseInt(id);
            }else System.out.println("ID có ít nhất 2 ký tự số");
        }
    }
    public static String account(){
        while (true) {
            String regex = "^.{3,16}$";
            String account = scanner.nextLine();
            if (account.matches(regex)) return account;
            else System.out.println("Nhập 3-16 kí tự chữ hoặc số");
        }
    }
    public static String mobileNumber(){
        while (true){
            String regex = "^0[1,3,5,7,8,9][0-9]{8}$";
            String mobileNumber = scanner.nextLine();
            if (mobileNumber.matches(regex)) return mobileNumber;
            else System.out.println("Nhập số điện thoại 10 số 0xxxxxxxxx");
        }
    }
}
