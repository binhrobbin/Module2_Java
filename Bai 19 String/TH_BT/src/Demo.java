import java.util.Objects;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

//        StringBuilder b = new StringBuilder("Hello");
//        StringBuffer c = new StringBuffer("World");

//        String a = "Hello"; // String literal
//        String b = "Linh";
//        String c = "Hello";
//        String d = c;
//        String e = new String("Hello"); // String Object
//        String f = new String("Linh");
//        String g = new String("Hello");
//
//        System.out.println(a == c); // true
//        System.out.println(e == g); // false
//        System.out.println(e.equals(g)); // true


//        String a = "Hello";
//        a.toUpperCase(); // return "HELLO"
//        System.out.println(a); // "Hello"
//
        StringBuffer b = new StringBuffer("Hello");
        b.append(" World"); // Hello World
        System.out.println(b);

//        String name = "Linh";
//        name.toUpperCase(); // trả về một chuỗi hoa
//        name.split(""); // [L, i, n, h]
//        name.charAt(1); (trả về giá trị của vị trí index trong chuỗi)
//        name.indexOf("k"); // -1 (trả về chỉ số index của ký tự trong chuỗi)

        String s1 = "java";//Tạo chuỗi bằng string literal
        char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
        String s2 = new String(ch);//convert mảng char thành chuỗi
        String s3 = new String("example");//Tạo chuỗi bằng từ khóa new
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        // [a-zA-Z]{2;7}
        // [0-9]+

//        Scanner scanner = new Scanner(System.in);
//        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
//
//        while (true) {
//            System.out.println("Enter Email: ");
//            String input = scanner.nextLine();
//            if(input.matches(regex)){
//                System.out.println("Your Email: " + input);
//                break;
//            } else {
//                System.out.println("Sai dinh dang Email! Nhap lai (test@gmail.com)");
//            }
//        }
    }
}
