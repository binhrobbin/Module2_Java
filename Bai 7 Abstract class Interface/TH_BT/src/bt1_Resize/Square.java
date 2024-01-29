package bt1_Resize;

public class Square extends Rectangle implements Resizeable{
    public Square(double size){
        super(size,size);
    }
    public double getSize(){
        return getWidth();
    }
    public void setSize(double size){
        setLength(size);
        setWidth(size);
    }

    @Override
    public void resize(double percent) {
        super.resize(percent);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public String toString() {
        return "Square {" + "size=" + width + '}';
    }
}
