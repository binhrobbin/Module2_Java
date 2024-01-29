package bt4_Shape_Triangle;

public class Shape4 {
    private String color = "black";
    public Shape4() {
    }

    public Shape4(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + color;
    }
}
