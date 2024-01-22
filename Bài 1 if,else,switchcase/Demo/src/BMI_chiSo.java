import java.util.Scanner;

public class BMI_chiSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập chiều cao cm: ");
        double height = scanner.nextDouble();
        System.out.println("Mời bạn nhập cân nặng kg: ");
        short weight = scanner.nextShort();
        System.out.println("chiều cao của bạn là(cm): "+height);
        System.out.println("cân nặng của bạn là(kg): "+weight);
        double bmi = weight/(Math.pow(height/100,2));
        System.out.println("%-20s%s "+ bmi+ " Interpretation\n");
        if (bmi<18.5) System.out.println("Bạn đang gầy");
        else if (bmi<25) System.out.println("Bạn bình thường");
        else if (bmi<30) System.out.println("Bạn đang thừa cân");
        else System.out.println("Bạn đang béo phì");

    }
}
