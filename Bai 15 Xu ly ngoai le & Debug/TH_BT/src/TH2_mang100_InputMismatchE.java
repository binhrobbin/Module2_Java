import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TH2_mang100_InputMismatchE {
    public static int[] createArrayRandom(int[] array){
        Random random= new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[100];
        TH2_mang100_InputMismatchE.createArrayRandom(array);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Nhập chỉ số muốn tìm");
        try {
            int index = scanner.nextInt();
            System.out.println("Chỉ số "+index+" của mảng" + array[index] );
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("chỉ số vượt quá giới hạn của mảng");
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Lỗi");
        }
    }
}
