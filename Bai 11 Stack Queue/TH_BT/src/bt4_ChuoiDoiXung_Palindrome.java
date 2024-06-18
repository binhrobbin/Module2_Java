import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class bt4_ChuoiDoiXung_Palindrome {
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
            stack.push(str.charAt(i));
        }
        boolean checkOn = true;
        while (!queue.isEmpty()){
           if (queue.remove() != stack.pop()){
               checkOn = false;
           }
        }
        if (checkOn) System.out.println("Là chuỗi đối xứng Palindrome");
        else System.out.println("KO phải");
    }
}
