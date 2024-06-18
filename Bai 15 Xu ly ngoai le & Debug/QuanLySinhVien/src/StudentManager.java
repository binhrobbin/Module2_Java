import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager {
    Student student1 = new Student("Bình","Nam",7.7,6.5,8.8);
    Student student2 = new Student("Hoàng","Nam",7.4,6.9,5.7);
    Student student3 = new Student("Hiếu","Nam",8.5,6.6,7.9);
    Student student4 = new Student("Khoa","Nam",9.7,6.1,6.6);
    static List<Student> list = new ArrayList<>();
    public void add (){
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
    }
    public void displayAll(){
        for (Student student:list){
            System.out.println(student);
        }
    }

    public void addStudent(String name, String gender, double toan, double van, double anh){
        Student student = new Student(name,gender,toan,van,anh);
        System.out.println("Bạn vừa thêm mới sinh viên:\n"+student);
    }
    public void deleteStudent (int index){
        System.out.println("Xóa thành công sinh viên: "+list.get(index));
        list.remove(index);
        // load lại ID
        Student.countId = 0;
        for (Student student:list){
            Student.countId++;
            student.setId(Student.countId);
        }
    }
    public void editStudent(int index, String name, String gender, double toan, double van, double anh){
        System.out.println("Đã sửa thành công sinh viên: \n"+list.get(index)+"\n thành: ");
        list.get(index).setName(name);
        list.get(index).setGender(gender);
        list.get(index).setToan(toan);
        list.get(index).setVan(van);
        list.get(index).setAnh(anh);
        list.get(index).setDTB((toan+van+anh)/3);
        System.out.println(list.get(index));
    }
    public void  searchName(String keySearch){
        boolean checkOn = false;
        System.out.println("Danh sách sinh viên là: ");
        for (Student student: list){
           if (student.getName().contains(keySearch)){
               System.out.println(student);
               checkOn = true;
           }
        }
        if (!checkOn) System.out.println("Không có sinh viên nào");
    }
    public void showMaxDTB(){
        List<Student> tempList = new ArrayList<>();
        tempList.addAll(list);
        Collections.sort(tempList);
        for (int i = 0; i < tempList.size(); i++) {
            if (tempList.get(i).getDTB() == tempList.get(0).getDTB()){
                System.out.println(tempList.get(i));
            }else break;
        }

    }
}
