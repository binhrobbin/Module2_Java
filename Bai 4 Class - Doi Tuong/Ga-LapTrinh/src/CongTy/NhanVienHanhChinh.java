package CongTy;

public class NhanVienHanhChinh extends NhanVien{
    public NhanVienHanhChinh(String ten, String queQuan, int cccd) {
        super(ten, queQuan, cccd);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan;
    }
}
