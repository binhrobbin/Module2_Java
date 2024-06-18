import java.util.Scanner;
import java.util.Stack;

public class bt5_KiemTraNgoacDung_sym {
    public static boolean kiemtraNgoac(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '('){
                stack.push('(');
            }
            if (str.charAt(i) == ')'){
                if (stack.isEmpty()) return false;
                else stack.pop();
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biểu thức: ");
        String str = scanner.nextLine();
        if (kiemtraNgoac(str)) System.out.println("Là biểu thức đúng");
        else System.out.println("Biểu thức sai ngoặc");
    }
}
