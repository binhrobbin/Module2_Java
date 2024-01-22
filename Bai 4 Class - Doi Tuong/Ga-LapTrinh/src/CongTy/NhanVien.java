package CongTy;

public abstract class NhanVien {
    protected String ten;
    protected String queQuan;
    protected int cccd;
    protected double luongCoBan=850 ; ///850$

    public NhanVien(String ten, String queQuan, int cccd) {
        this.ten = ten;
        this.queQuan = queQuan;
        this.cccd = cccd;
    }

    public abstract double tinhLuong();
}
