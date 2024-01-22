package TinhDaHinh;

public class TruongPhong extends NhanSu{
    public TruongPhong(String ten, double cccd, String queQuan) {
        super(ten, cccd, queQuan);
    }

    public TruongPhong(String ten, double cccd) {
        super(ten, cccd);
    }

    public TruongPhong() {
    }

    @Override
    public double tinhLuong(int ngayCong) {
        return 50*ngayCong; //50$ 1 ngày công
    }

    @Override
    public String toString() {
        return "aaatp";
    }
}
