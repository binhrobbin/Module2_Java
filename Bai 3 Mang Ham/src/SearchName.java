import java.util.Scanner;

public class SearchName {
    public static void main(String[] args) {
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner ip = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên sv cần tìm");
        String name = ip.nextLine();
        boolean trung = true;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(name)){
                System.out.println(" Vị trí của "+name+" trong danh sách là: "+(i+1));
                trung = false;
            }
        }
        if (trung){
            System.out.println(name+" KO có trong danh sách ");
        }
    }
}
