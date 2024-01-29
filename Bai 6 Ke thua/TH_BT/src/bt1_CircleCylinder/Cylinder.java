package bt1_CircleCylinder;

public class Cylinder extends Circle1 {
    private double height = 2.0;

    public Cylinder(){
    }

    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder {" +
                "height=" + height +" "+
                 super.toString()+"}";
    }

    public double getVolume(){
        return super.getArea()*height;
    }
}
