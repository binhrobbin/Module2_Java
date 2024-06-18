import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        char character = (char) 99;
        int ascii = (int) inputString.charAt(2);
        System.out.println(character);
        System.out.println(ascii);
    }
}
