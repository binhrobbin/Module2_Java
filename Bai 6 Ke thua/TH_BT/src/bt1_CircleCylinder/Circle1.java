package bt1_CircleCylinder;

public class Circle1 {
private double radius = 1.0;
private String color = "white";

    public Circle1() {
    }

    public Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                "radius=" + radius +
                ", color='" + color+"'" ;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
}
