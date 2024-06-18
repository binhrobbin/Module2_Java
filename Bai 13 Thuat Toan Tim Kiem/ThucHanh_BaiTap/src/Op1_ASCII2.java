import java.util.Scanner;

public class Op1_ASCII2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String inputString = scanner.nextLine();
        int[] arrayTimes = new int[255];                    //{1}
        for (int i = 0; i < inputString.length(); i++) {    //{2}
            int ascii = (int) inputString.charAt(i);        //{3}
            arrayTimes[ascii] += 1;                         //{4}
        }
        int max = 0;                                        //{5}
        char character = 0;                                 //{6}
        for (int i = 0; i < arrayTimes.length; i++) {       //{7}
            if (arrayTimes[i]>max){                         //{8}
                max = arrayTimes[i];                        //{9}
                character = (char) i;                       //{10}
            }
        }
        System.out.println("ký tự xuất hiện nhiều nhất là: "+character+" là "+ max+" lần");
    }

/*********************************************************************************
 *- Thời  gian thực hiện lệnh {1}là O(1)
 * Hai lệnh gán {3} và {4} đều tốn O(1) thời gian. Vòng lặp {2} thực hiện (n) lần, mỗi lần O(1) do đó vòng lặp {2} tốn O((n).1) = O(n)  với  n là độ dài chuỗi ký tự.
 *
 * - Thời  gian thực hiện lệnh {5} và {6} đều là O(1)
 *
 * Hai lệnh gán {9} và {10} đều tốn O(1) thời gian, việc so sánh frequentChar[j] > max  cũng tốn O(1) thời gian, do đó lệnh {8} tốn O(1) thời gian. Vòng lặp {7} thực hiện (255) lần, mỗi lần O(1) do đó vòng lặp {7} tốn O((255).1) = O(255).
 *
 * Chú ý: Trong trường hợp vòng lặp không xác định được số lần lặp thì chúng ta phải lấy số lần lặp trong trường hợp xấu nhất.
 *
 * Độ phức tạp của thuật toán cũng chính là thời gian thực hiện chuỗi lệnh {1}, {2}, {5}, {6}, {7}, và được tính bằng thời gian thi hành lệnh lâu nhất trong chuỗi lệnh.
 *
 * Ta sẽ có 2 trường hợp
 * TH1: n <= 255
 *
 * Khi đó độ phức tạp của thuật toán  sẽ là thời gian thực hiện lệnh {7} và bằng O(255)
 *
 * TH2: n> 255
 *
 * Khi đó độ phức tạp của thuật toán  sẽ là thời gian thực hiện lệnh {2} và bằng O(n)
 *********************************************************************************/
}