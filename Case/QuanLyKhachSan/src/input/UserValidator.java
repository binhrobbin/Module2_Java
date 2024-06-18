package input;

import java.util.Scanner;

public class UserValidator {
    private static Scanner scanner = new Scanner(System.in);
    public static String account(){
        while (true) {
            String regex = "^.{3,8}$";
            String account = scanner.nextLine();
            if (account.matches(regex)) return account;
            else System.out.println("Nhập 3-8 kí tự chữ hoặc số");
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
    public static String email(){
        while (true){
            String regex = "^[a-z]{3}@gmail.com$";
            String email = scanner.nextLine();
            if (email.matches(regex)) return email;
            else System.out.println("Nhập email kiểu abc@gmail.com");
        }
    }
    public static int age(){
        while (true){
            try {
                String regex = "[0-9]{2,}";
                String age = scanner.nextLine();
                int age2 = Integer.parseInt(age);
                if (age.matches(regex) && age2>=18) return age2;
                else System.out.println("Nhập số nguyên tuổi >= 18");
            }catch (NumberFormatException numberFormatException){
                System.out.println("Nhập số nguyên tuổi >= 18");
            }

        }
    }
}
