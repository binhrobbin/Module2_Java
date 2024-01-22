package th1_StaticProperty;

public class Main{
    public static void main(String[] args) {
        Student.change();

        Student s1= new Student(111,"Bình");
        Student s2= new Student(222,"Bình2");
        Student s3= new Student(333,"Bình3");

        s1.display();
        s2.display();
        s3.display();
    }
}
