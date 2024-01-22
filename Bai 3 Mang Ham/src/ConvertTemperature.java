import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        byte choice = input.nextByte();
        switch (choice) {
            case 1:
                System.out.println("Mời bạn nhập độ F: ");
                double doF = input.nextDouble();
                System.out.println("kết quả là độ C= "+ doFtodoC(doF));
                break;
            case 2:
                System.out.println("Mời bạn nhập độ C: ");
                double doC = input.nextDouble();
                System.out.println("kết quả là độ C= "+ doCtodoF(doC));
                break;
            case 0:
                break;
        }
    }

    public static double doFtodoC(double doF) {
        double doC = (5.0 / 9) * (doF - 32);
        return doC;
    }
    public static double doCtodoF(double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }
}
