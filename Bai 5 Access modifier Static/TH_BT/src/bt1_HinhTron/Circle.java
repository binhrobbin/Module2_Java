package bt1_HinhTron;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

     double getRadius() {
        return radius;
    }

     double getArea() {
        return Math.PI*radius*radius;
    }

}
