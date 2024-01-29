package bt2_howToColor;

//public class Test2 {
//    public static void main(String[] args) {
//        Colorable[] colorables = new Colorable[4];
//        colorables[0] = new Circle(2.0);
//        colorables[1] = new Circle(5.0);
//        colorables[2] = new Square(2.0);
//        colorables[3] = new Square(5.0);
//        for (Colorable colorable : colorables){
//            System.out.println(colorable);
//            if (colorable instanceof Circle){
//                Circle circle = (Circle) colorable;
//                circle.howToColor();
//            }else {
//                Square square = (Square) colorable;
//                square.howToColor();
//            }
//        }
//        System.out.println("----------------------------");
//    }
//}
// Viết rút gọn
public class Test2 {
    public static void main(String[] args) {
        Colorable[] colorables = {new Circle(2.0), new Circle(5.0),new Square(2.0),new Square(5.0)};
        for (Colorable colorable : colorables){
            System.out.println(colorable);
            if (colorable instanceof Circle){
                colorable.howToColor();
            }else {
                ((Square) colorable).howToColor();
            }
        }
        System.out.println("----------------------------");
    }
}