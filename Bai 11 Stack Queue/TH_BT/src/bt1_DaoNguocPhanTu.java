import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class bt1_DaoNguocPhanTu {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        Stack<Integer> stack = new Stack<>();
        for (int a:array){
            stack.push(a);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
//            stack.pop();
        }
        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuỗi: ");
        String str = scanner.nextLine();
        String str2 = "";
        Stack<String> stack2 = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack2.push(String.valueOf(str.charAt(i)));
        }
        while (!stack2.isEmpty()){
            str2 += String.valueOf(stack2.pop());
        }
        System.out.println("Chuỗi ban đầu là: "+str);
        System.out.println("Chuỗi sau đảo là: "+str2);
    }
}
