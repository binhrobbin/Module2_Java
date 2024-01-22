import java.util.Scanner;

public class LaiVay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng tiền cho vay");
        float money = sc.nextFloat();
        System.out.println("Mời bạn nhập tỉ lệ lãi suất theo tháng");
        float lai = sc.nextFloat();
        System.out.println("Mời bạn nhập số tháng cho vay");
        byte thang = sc.nextByte();
        float tonglai = 0;
        for (byte i = 1; i <= thang; i++) {
            tonglai += money*(lai/100)/12*thang;
        }
        System.out.println("Tổng tiền lãi là " + tonglai  );
    }
}
