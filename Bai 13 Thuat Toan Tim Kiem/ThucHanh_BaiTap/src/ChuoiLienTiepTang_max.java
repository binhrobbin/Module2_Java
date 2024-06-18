import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiLienTiepTang_max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi: ");
        String chuoi = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < chuoi.length(); i++) {                                      //1 Vòng lặp
            if ((list.size() > 0) && ((int)chuoi.charAt(i) <= (int)list.getLast())){
                list.clear();                                                           //1 câu lệnh
            }
            list.add(chuoi.charAt(i));                                                  //1 câu lệnh
            if (max.size()<list.size()){                                                //1 câu lệnh
                max.clear();
                max.addAll(list);
            }
        }
        System.out.println("Chuỗi lớn nhất liên tiếp cần tim là: ");
        for (Character x:max){                                                          //1 Vòng lặp
            System.out.print(x);                                                        //1 câu lệnh
        }
        /*********************************************************************************
         * Tính toán độ phức tạp của bài toán này:                                        *
         * 	1 vòng lặp * 3 câu lệnh = 3;                                                  *
         * 	1 vòng lặp * 1 câu lệnh = 1;                                                  *
         *                                                                                *
         * 	T(n) = O(n)                                                                   *
         *  Độ phức tạp của bài toán là O(n)                                           	  *
         *********************************************************************************/
    }
}
