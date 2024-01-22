package TesInterface;

public interface ViduInterface {
    //tập các thuộc tính (chỉ được phép là hằng số)
    static final double phuCap = 15; //15$
    //các phương thức
    public abstract void thongTin(String ten, double cccd, int namSinh);
    public abstract double tinhLuong(double luongNgay, int soNgayCong);
}
