package bai_9_Tien;

public class _20000 {
    //- Cần có tổng 20000 đồng từ 3 loại giấy bạc 1000 đồng, 2000 đồng, 5000 đồng.
    //Lập chương trình để tìm ra tất cả các phương án có thể
    public static void main(String[] args) {
        System.out.println("Các phương án la: ");
        int count = 0;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 10; j++) {
                for (int k = 0; k <= 20; k++) {
                    if (i*5+j*2+k == 20){
                        System.out.println("5000("+i+")  2000("+j+")  1000("+k+")");
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println("Tổng số phương án là: "+count);
    }
}
