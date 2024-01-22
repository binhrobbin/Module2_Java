package bt_Them;

public class Circle {
    private int id;
    private double radius;
    static int count;
    static double maxRadius;
    static final double PI = 3.14;
    static double sumArea ;

    Circle(double radius) {
        this.radius = radius;
        count++;
        this.id = count;
        if (maxRadius<radius) maxRadius=radius;
        sumArea +=getArea();
    }

    public String toString() {
        return "{" +
                "id=" + id +
                ", radius=" + radius +
                "} ";
    }

    static int displayAmount (){
        return count;
    }
    double getArea(){
        return PI*radius*radius;
    }
    double getPerimeter(){
        return 2*PI*radius;
    }
    static double getSumArea(){
        return sumArea;
    }
}
