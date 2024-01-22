import java.util.Scanner;

public class Bt8_KytuXuatHien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào một chuỗi bất kỳ: ");
        String abc = input.nextLine();
        System.out.println("Mời bạn nhập vào một ký tự để kiểm tra: ");
        String x = input.nextLine();
        short count = 0;
        for (int i = 0; i < abc.length(); i++) {
            String y = String.valueOf(abc.charAt(i));
            if (x.equals(y)){
                count++;
            }
        }
        System.out.println("số lần ký tự "+x+" xuất hiện trong chuỗi "+abc+" là: "+count);
    }
}
