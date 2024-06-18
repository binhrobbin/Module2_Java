import java.util.Stack;

public class bt3_ThapPhan_NhiPhan {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int a=111;
        String str = "";
        while (a!=0){
           stack.push( a%2);
           a = a/2;

        }
        while (!stack.isEmpty()){
           str += String.valueOf(stack.pop());
        }
        System.out.println(str);
    }
}
