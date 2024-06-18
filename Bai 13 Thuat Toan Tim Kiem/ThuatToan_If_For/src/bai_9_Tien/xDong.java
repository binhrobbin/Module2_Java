package bai_9_Tien;

import java.util.Scanner;

public class xDong {
    //- Cần có tổng x đồng từ 2 loại giấy bạc, 2000 đồng, 5000 đồng.
    //Lập chương trình để tìm ra phương án ít số lượng tiền nhất
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập tổng số tiền cần tính đơn vị (nghìn đồng): ");
        int x = scanner.nextInt();
        System.out.println("phương án ít số lượng tiền nhất là: ");
        int count = 0, a = x/5, b=x/2;
        for (int i = a; i >=0; i--) {
            for (int j = 0; j <= b; j++) {
                    if (i*5+j*2 == x){
                        System.out.println("5000("+i+")  2000("+j+")");
                        count++;
                        break;
                    }
            }
            if (count == 1) break;
        }
        if (count ==0) System.out.println("Không tìm được phương án nào hợp lí");
    }
}