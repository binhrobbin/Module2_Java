import java.util.Scanner;

public class PtBac1 {
    public static void main(String[] args) {
//        byte a,b;
        System.out.println("Giải pt bậc 1 ax+b = 0 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập giá trị a: ");
        byte a = scanner.nextByte();
        System.out.println("Mời bạn nhập giá trị b: ");
        byte b = scanner.nextByte();
        if (a == 0){
            System.out.println("pt có vô số nghiệm");
        }
        else System.out.println("Pt có nghiệm là x= "+ -b/a);
    }
}

