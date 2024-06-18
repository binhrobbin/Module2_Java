package input;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);
    public static int number() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Nhập số nguyên!");
            }
        }
    }
    public static String string() {
        while (true) {
            String regex = ".+";
            String str = scanner.nextLine();
            if (str.matches(regex)) return str;
            else System.out.println("Không nhập chuỗi trống");
        }
    }
    public static int getID(){
        String regex = "[0-9]{2,}";
        while (true){
            String id = scanner.nextLine();
            if (id.matches(regex)){
                int ipOutput = Integer.parseInt(id);
                return ipOutput;
            }else System.out.println("ID có ít nhất 2 ký tự số");
        }
    }
}
