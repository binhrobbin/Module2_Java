import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Mời bạn nhập vào số cần kiểm tra snt: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<2) System.out.println("Số bạn nhập không hợp lệ ");
        else {
            byte i = 2;
            boolean check = true;
            for (; i <= (Math.sqrt(a)); i++) {
                if (a%i == 0){
                    check = false;
                    break;
                }
            }
            if (check) System.out.println(a+ " là snt ");
            else System.out.println(a+ " KO là snt ");
        }
    }
}
