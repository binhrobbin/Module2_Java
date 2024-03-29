package bt4_Shape_Triangle;

public class Triangle extends Shape4{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(){
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        double p = (side1+side2+side3)/2;
        double s = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return s;
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public boolean isTriangle(){
        return ((side1+side2)>side3 && (side1+side3)>side2 && (side3+side2)>side1);
    }

    @Override
    public String toString() {
        return  "Thông tin tam giác bạn nhập vào là: \n"+
                "Màu sắc: "+ super.getColor()+"\n"+
                "Chu vi: "+ getPerimeter()+"\n"+
                "Diện tích: "+ getArea();
    }
}
