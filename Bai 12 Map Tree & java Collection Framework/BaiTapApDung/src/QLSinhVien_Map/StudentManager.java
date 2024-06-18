package QLSinhVien_Map;

import java.util.*;

public class StudentManager {
    Scanner scanner = new Scanner(System.in);
//    ArrayList<Student> arrayList = new ArrayList<>(100);
    Map<Integer,Student> map = new HashMap<>(100);
    Student student1 = new Student("Bình", 16, "abc@def");
    Student student2 = new Student("Hiếu", 16, "abc@def");
    Student student3 = new Student("Khoa", 16, "abc@def");
    Student student4 = new Student("Hoàng", 16, "abc@def");
    Set<Integer> set = map.keySet();
    public void displaydefault() {
        map.put(student1.getId(), student1);
        map.put(student2.getId(), student2);
        map.put(student3.getId(), student3);
        map.put(student4.getId(), student4);
//        arrayList.add(student1);
//        arrayList.add(student2);
//        arrayList.add(student3);
//        arrayList.add(student4);
    }
    public void display(){
        for (Integer item: set){
            System.out.println(map.get(item));
        }
    }
    public void addStudent(){
        System.out.println("Nhập tên mới: ");
        String name = scanner.nextLine();
        System.out.println("Nhập age mới: ");
        int age =Integer.parseInt( scanner.nextLine());
        System.out.println("Nhập email mới: ");
        String email = scanner.nextLine();
                Student addStudent = new Student(name,age,email);
//        arrayList.add(new Student(name,age,email));
        map.put(addStudent.getId(),addStudent);
        System.out.println("Bạn vừa thêm sp mới: ");
        System.out.println(map.get(addStudent.getId()));
    }
    void editStudent(){
        int checkSearch = 0;
        do {
            System.out.println("Nhập tên sinh viên bạn muốn sửa:");
            String name = scanner.nextLine();
            for (Integer item:set){
                if (map.get(item).getName().equals(name)){
                    System.out.println("Nhập tên sửa lại:");
                    String newName = scanner.nextLine();
                    System.out.println("Nhập age sửa lại:");
                    int newAge = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập email sửa lại:");
                    String newEmail = scanner.nextLine();

                    System.out.println("bạn vừa sửa ");
                    System.out.println(map.get(item));
                    map.get(item).setName(newName);
                    map.get(item).setAge(newAge);
                    map.get(item).setEmail(newEmail);
                    System.out.println("thành: ");
                    System.out.println(map.get(item));
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
            for (Integer item:set){
                if (map.get(item).getName().equals(name)) {
                    map.remove(item);
                    System.out.println("Bạn đã xóa: '" + name + "' ra khỏi danh sách");
                    checkSearch++;
                    break;
                }
            }
            if (checkSearch == 0) System.out.println("Bạn nhập sai tên");
        }while (checkSearch ==0);
        //Load lại ID
        Student.idCount = 0;
        for (int item:set){
            Student.idCount++;
            map.get(item).setId(Student.idCount);
        }
    }
    void searchName (){
        System.out.println("Mời bạn nhập tên/ký tự cần tìm");
        String x = scanner.nextLine();
        System.out.println("Danh sách cần tìm của bạn là: ");
        int checkSearch = 0;
        for (Integer item: set){
            if (map.get(item).getName().contains(x)) {
                System.out.println(map.get(item));
                checkSearch++;
            }
        }
        if (checkSearch == 0) System.out.println("Ko tìm thấy gì");
    }
    void searchID (){
        System.out.println("Mời bạn nhập ID cần tìm");
        int x =Integer.parseInt( scanner.nextLine());
        System.out.println("Thông tin theo ID= "+x+" cần tìm của bạn là: ");
        int checkSearch = 0;
        for (int item: set){
            if (map.get(item).getId() == x) {
                System.out.println(map.get(item));
                checkSearch++;
            }
        }
        if (checkSearch == 0) System.out.println("Ko tìm thấy gì");
    }
}


