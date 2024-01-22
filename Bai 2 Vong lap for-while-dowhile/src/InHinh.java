import java.util.Scanner;

public class InHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: " +
                "top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        byte choice = input.nextByte();
        System.out.println("Bạn muốn vẽ hình bằng ký tự gì? ");
        input.nextLine();
        String kytu = input.nextLine();
        String ve = "";
        switch (choice) {
            case 1:
                System.out.println("Mời bạn nhập cạnh a: ");
                int a = input.nextInt();
                System.out.println("Mời bạn nhập cạnh b: ");
                int b = input.nextInt();
                for (int i = 0; i < a; i++) {
                    ve = "";
                    for (int j = 0; j < b; j++) {
                        ve += kytu;
                    }
                    System.out.println(ve);
                }
                break;
            case 2:
                System.out.println("Mời bạn nhập chiều cao hình tam giác vuông: ");
                int c = input.nextInt();
                //In hình tam giác vuông, có cạnh góc vuông ở botton-left
                System.out.println("Hình 1: ");
                for (int i = 0; i < c; i++) {
                    ve += kytu;
                    System.out.println(ve);
                }

                //In hình tam giác vuông, có cạnh góc vuông ở top-left
                System.out.println("Hình 2: ");
                for (int i = c; i > 0; i--) {
                    ve = "";
                    for (int j = 1; j <= i; j++) {
                        ve += kytu;
                    }
                    System.out.println(ve);
                }

                //In hình tam giác vuông, có cạnh góc vuông ở bottom-right
                System.out.println("Hình 3: ");
                String kt = "";
                for (int i = 1; i <= c; i++) {
                    ve = "";
                    kt = "";
                    for (int j = 1; j <= c - i; j++) {
                        kt += " ";
                    }
                    for (int k = 1; k <= i; k++) {
                        ve += kytu;
                    }
                    String vetong = kt + ve;
                    System.out.println(vetong);
                    vetong = "";
                }

                //In hình tam giác vuông, có cạnh góc vuông ở top-right
                System.out.println("Hình 4: ");
                String kt2 = "";
                for (int i = 1; i <= c; i++) {
                    ve = "";
                    kt2 = "";
                    for (int j = 1; j < i; j++) {
                        kt2 += " ";
                    }
                    for (int k = 1; k <= c-i+1; k++) {
                        ve += kytu;
                    }
                    String vetong = kt2 + ve;
                    System.out.println(vetong);
                    vetong = "";
                }break;
            case 3:
                //In hình tam giác cân
                System.out.println("Mời bạn nhập chiều cao hình tam giác cân: ");
                int d = input.nextInt();
                String kt3 = "";
                for (int i = 1; i <= d; i++) {
                    ve = kytu;
                    kt3 = "";
                    for (int j = 1; j <= d- i; j++) {
                        kt3 += " ";
                    }
                    for (int k = 1; k < i ; k++) {
                        ve += kytu+kytu;
                    }
                    String vetong = kt3 + ve + kt3;
                    System.out.println(vetong);
                    vetong = "";
                }break;
            case 4:break;
        }
    }
}
