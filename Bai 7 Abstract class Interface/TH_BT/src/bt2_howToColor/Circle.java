package bt2_howToColor;

public class Circle implements Colorable {
    private double radius  ;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void howToColor() {
        System.out.println("Màu vàng");
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                '}';
    }
}
