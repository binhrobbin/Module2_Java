import java.io.*;
import java.util.ArrayList;
import java.util.List;
class Student implements Serializable {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Read_Write_BinaryFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Student student = new Student(1, "Linh"); // encode
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.dat"));
//        objectOutputStream.writeObject(student);
//        objectOutputStream.close();

//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.dat"));
//        Student student = (Student) objectInputStream.readObject();
//        System.out.println(student);


//        List<Student> list = new ArrayList<>();
//        list.add(new Student(1, "Linh"));
//        list.add(new Student(2, "Huy"));
//        list.add(new Student(3, "Coong"));
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.dat"));
//        objectOutputStream.writeObject(list);
//        objectOutputStream.close();


        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.dat"));
        List<Student> listReadFile = (List<Student>) objectInputStream.readObject();
        for (Student s: listReadFile) {
            System.out.println(s);
        }
    }
}