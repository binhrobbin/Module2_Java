import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> arrayList = new ArrayList<>(100);
    Student student1 = new Student("Bình", 16, "abc@def");
    Student student2 = new Student("Hiếu", 16, "abc@def");
    Student student3 = new Student("Khoa", 16, "abc@def");
    Student student4 = new Student("Hoàng", 16, "abc@def");
    public void displaydefault() {
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
    }
    public void display(){
        for (Student student:arrayList){
                System.out.println(student);
        }
    }
    public void addStudent(){
        System.out.println("Nhập tên mới: ");
        String name = scanner.nextLine();
        System.out.println("Nhập age mới: ");
        int age =Integer.parseInt( scanner.nextLine());
        System.out.println("Nhập email mới: ");
        String email = scanner.nextLine();
//                Student addStudent = new Student(name,age,email);
                arrayList.add(new Student(name,age,email));
                System.out.println("Bạn vừa thêm sp mới: ");
                for (Student student:arrayList) {
                    System.out.println(student);
                }
    }
    void editStudent(){
        int checkSearch = 0;
        do {
            System.out.println("Nhập tên sinh viên bạn muốn sửa:");
            String name = scanner.nextLine();
            for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).getName().equals(name)) {
                        System.out.println("Nhập tên sửa lại:");
                        String newName = scanner.nextLine();
                        System.out.println("Nhập age sửa lại:");
                        int newAge = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nhập email sửa lại:");
                        String newEmail = scanner.nextLine();

                        System.out.println("bạn vừa sửa ");
                        System.out.println(arrayList.get(i));
                        arrayList.get(i).setName(newName);
                        arrayList.get(i).setAge(newAge);
                        arrayList.get(i).setEmail(newEmail);
                        System.out.println("thành: ");
                        System.out.println(arrayList.get(i));
                        checkSearch++;
                        break;
                    }
            }
            if (checkSearch == 0) System.out.println("Bạn nhập sai tên");
        }while (checkSearch ==0);
    }
    void deleteStudent(){
        int checkSearch = 0;
        do {
            System.out.println("Nhập tên sinh viên bạn muốn xóa:");
            String name = scanner.nextLine();
            for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).getName().equals(name)) {
                        arrayList.remove(i);
                        System.out.println("Bạn đã xóa: '" + name + "' ra khỏi danh sách");
                        checkSearch++;
                        break;
                    }
            }
            if (checkSearch == 0) System.out.println("Bạn nhập sai tên");
        }while (checkSearch ==0);
        //Load lại ID
        Student.idCount = 0;
        for (int i = 0; i < arrayList.size(); i++) {
                Student.idCount++;
                arrayList.get(i).setId(Student.idCount);
        }
    }
    void searchName (){
        System.out.println("Mời bạn nhập tên/ký tự cần tìm");
        String x = scanner.nextLine();
        System.out.println("Danh sách cần tìm của bạn là: ");
        int checkSearch = 0;
        for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).getName().contains(x)) {
                    System.out.println(arrayList.get(i));
                    checkSearch++;
                }
        }
        if (checkSearch == 0) System.out.println("Ko tìm thấy gì");
    }
    void searchID (){
        System.out.println("Mời bạn nhập ID cần tìm");
        int x =Integer.parseInt( scanner.nextLine());
        System.out.println("Danh sách cần tìm của bạn là: ");
        int checkSearch = 0;
        for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).getId() == x) {
                    System.out.println(arrayList.get(i));
                    checkSearch++;
                }
        }
        if (checkSearch == 0) System.out.println("Ko tìm thấy gì");
    }
}

