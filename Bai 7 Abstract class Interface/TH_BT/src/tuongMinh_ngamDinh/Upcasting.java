package tuongMinh_ngamDinh;

public class Upcasting {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal1 = cat; // Chuyển kiểu dang khuyết (java nó tự hiểu)
//        Animal animal2 = (Animal) cat; // Chuyển kiểu dạng  đầy đủ
        Animal animal2 = new Cat();
        Animal animal3 = new Animal();
//        Cat cat3 = new Animal(); //lỗi compile
        Cat cat2 = (Cat) animal2;
//        Cat cat3 = (Cat) animal3;  // lỗi run-time

        cat.eat();
        cat.meow();
        animal1.eat();
//        animal2.eat();

//        Animal a = new Animal(); // Chuyển kiểu không tường minh
////        Animal b1 = new Cat(); // Chuyển kiểu tường minh
//        Cat b = new Cat();
////        Cat cat2 = new Animal();
////        b1.m2();
////        b.m2();
////        b1.m1();
////        b.m1();
//
//        Animal b1 = (Animal) b; // Khai báo ngầm định
//        Cat newB = (Cat) b1;    // Khai báo tường minh
//        Cat newB1 = (Cat) a;    // Khai báo tường minh

//        cat.eat();
//        cat.meow();
//        animal1.eat();
//        System.out.println(cat);
//        animal2.eat();
//        System.out.println(animal1);
//        System.out.println(animal2);
//        // animal2.meow(); // Không thể gọi phương thức meow()
    }

}
