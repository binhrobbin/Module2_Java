//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
//public class A {
//    public String name = "aaaa";
//    public String id = "aaaa";
//    static public class B {
//        public String name ="bbbb";
//    }
//
//    public class C {
//        public String name ="cccc";
//    }
//
//    public static void main(String[] args) {
//        B o = new B();
//        System.out.println(o.name);
//        A o1 = new A();
//        System.out.println(o1.name);
////        C o2 = new C();   //lỗi
////        System.out.println(o2.id);
//        A.B o3 = new A.B();   // Tạo cho B
//        System.out.println(o3.name);
////        A.C o4 = new A.C(); // lỗi
//        A.C o5 = new A().new C(); //Tạo cho C
//        System.out.println(o5.name);
////        System.out.println(o5.id);
//    }
//}