package input;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static int number() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Hãy nhập số nguyên!");
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
    public static int sure() {
        String regex = "[1-2]";
        while (true) {
            String id = scanner.nextLine();
            if (id.matches(regex)) {
                return Integer.parseInt(id);
            } else System.out.println("Chỉ nhập số 1 hoặc 2");
        }
    }
}