package bt1_Resize;

public class Rectangle implements Resizeable{
    public double  width  ;
    public double  length  ;


    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }

    @Override
    public void resize(double percent) {
        this.width += this.width*percent/100;
        this.length += this.length*percent/100;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
