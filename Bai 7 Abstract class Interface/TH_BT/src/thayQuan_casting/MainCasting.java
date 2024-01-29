package thayQuan_casting;

public class MainCasting {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
//        parent.m1();
//        child.m1();
//        child.m2();

        // ép kiểu ngầm định - Upcasting Khi (biến tham chiếu của lớp cha tham chiếu tới đối tượng của lớp con)
        Parent parent1 = new Child();
        Parent parent0 = (Parent) new Child(); // ngầm định nghĩa là ở đây ko viết (Parent) cũng đc
//        Child child1 = new Parent(); //lỗi compile - KO ép đối tượng cha về kiểu con
        parent1.m1(); // runtime vẫn sẽ chạy theo kiểu DL thực tế là con "m1 of Child"
//        parent1.m2(); // ko gọi được vì đang gọi theo kiểu DL khai báo là cha

        // ép kiểu tường minh - Downcasting (ép về đúng kiểu thực tế nó là)
        Child child2 = (Child) parent1;
        child2.m1();
        child2.m2();
        System.out.println("-----------");

        // ép kiểu này sẽ phát sinh ra lỗi khi runtime: ClassCastException
        // Java đang tin vào lập trình viên sẽ code đúng (cho ép) nên ko có lỗi compile trong TH này
        Child child3 = (Child) parent; // lỗi ngay từ dòng này casting
        child3.m1();
        child3.m2();
    }
}
// TẠI THỜI ĐIỂM THỰC THI (runtime) THÌ KIỂU DỮ LIỆU THỰC TẾ SẼ ĐƯỢC SỬ DỤNG
// TẠI THỜI ĐIỂM COMPILE THÌ THÌ KIỂU DL KHAI BÁO SẼ ĐƯỢC SỬ DỤNG
