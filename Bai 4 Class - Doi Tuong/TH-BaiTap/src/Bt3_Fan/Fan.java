package Bt3_Fan;

public class Fan {
    private final int SLOW = 1,MEDIUM = 2,FASt = 3;
    private int speed = SLOW;
    private boolean on_off = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on_off;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn_off(boolean on_off) {
        this.on_off = on_off;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on_off) {
            return ("Fan {" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    " -fan is on"+
                    '}');
        }else return ("Fan {" + "radius=" + radius +
                ", color='" + color + '\'' +
                " -fan is off"+
                '}');
    }
}
