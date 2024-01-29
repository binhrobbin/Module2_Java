package bt2_Point;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){
    }

    public Point3D(float z) {
        super();
        this.z = z;
    }
    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] xyz = {super.getX(),super.getY(),this.z};
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D {" +
                "z=" + z +
                " " + super.toString()+" }";
    }
}
