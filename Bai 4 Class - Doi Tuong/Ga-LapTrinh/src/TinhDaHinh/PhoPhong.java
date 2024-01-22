package TinhDaHinh;

public class PhoPhong extends NhanSu{
    public PhoPhong(String ten, double cccd, String queQuan) {
        super(ten, cccd, queQuan);
    }

    public PhoPhong(String ten, double cccd) {
        super(ten, cccd);
    }

    public PhoPhong() {
    }

    @Override
    public double tinhLuong(int ngayCong) {

        return 40*ngayCong; //40$ 1 ngày công
    }


}
