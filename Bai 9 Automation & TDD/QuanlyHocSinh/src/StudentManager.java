import java.util.Scanner;

public class StudentManager {
    Scanner scanner = new Scanner(System.in);
    Student[] students = new Student[100];
    Student student1 = new Student("Bình", 16, "abc@def");
    Student student2 = new Student("Hiếu", 16, "abc@def");
    Student student3 = new Student("Khoa", 16, "abc@def");
    Student student4 = new Student("Hoàng", 16, "abc@def");
    public void displaydefault() {
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
    }
    public void display(){
        for (Student student:students){
            if (student != null)
            System.out.println(student);
            else break;
        }
    }
    public void addStudent(){
        System.out.println("Nhập tên mới: ");
        String name = scanner.nextLine();
        System.out.println("Nhập age mới: ");
        int age =Integer.parseInt( scanner.nextLine());
        System.out.println("Nhập email mới: ");
        String email = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                students[i] =new Student(name,age,email);
                System.out.println("Bạn vừa thêm sp mới: ");
                System.out.println(students[i]);
                break;
            }
        }

    }
    void editStudent(){
        int checkSearch = 0;
        do {
            System.out.println("Nhập tên sinh viên bạn muốn sửa:");
            String name = scanner.nextLine();
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                    if (students[i].getName().equals(name)) {
                        System.out.println("Nhập tên sửa lại:");
                        String newName = scanner.nextLine();
                        System.out.println("Nhập age sửa lại:");
                        int newAge = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nhập email sửa lại:");
                        String newEmail = scanner.nextLine();
                        System.out.println("bạn vừa sửa ");
                        System.out.println(students[i]);
                        students[i].setName(newName);
                        students[i].setAge(newAge);
                        students[i].setEmail(newEmail);
                        System.out.println("thành: ");
                        System.out.println(students[i]);
                        checkSearch++;
                        break;
                    }
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
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                    if (students[i].getName().equals(name)) {
                        Student[] newStudent = new Student[100];
                        for (int j = 0; j < newStudent.length; j++) {
                            if (students[j] != null) {
                                if (j < i) newStudent[j] = students[j];
                                else newStudent[j] = students[j + 1];
                            }
                        }
                        students = newStudent;
                        System.out.println("Bạn đã xóa: '" + name + "' ra khỏi danh sách");
                        checkSearch++;
                    }
                }
            }
            if (checkSearch == 0) System.out.println("Bạn nhập sai tên");
        }while (checkSearch ==0);
        //Load lại ID
        Student.idCount = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                Student.idCount++;
                students[i].setId(Student.idCount);
            }
        }
    }
    void searchName (){
        System.out.println("Mời bạn nhập tên/ký tự cần tìm");
        String x = scanner.nextLine();
        System.out.println("Danh sách cần tìm của bạn là: ");
        int checkSearch = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getName().contains(x)) {
                    System.out.println(students[i]);
                    checkSearch++;
                }
            }
        }
        if (checkSearch == 0) System.out.println("Ko tìm thấy gì");
    }
    void searchID (){
        System.out.println("Mời bạn nhập ID cần tìm");
        int x =Integer.parseInt( scanner.nextLine());
        System.out.println("Danh sách cần tìm của bạn là: ");
        int checkSearch = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == x) {
                    System.out.println(students[i]);
                    checkSearch++;
                }
            }
        }
        if (checkSearch == 0) System.out.println("Ko tìm thấy gì");
    }
}
