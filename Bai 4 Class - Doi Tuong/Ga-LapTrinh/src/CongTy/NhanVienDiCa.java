package CongTy;

public class NhanVienDiCa extends NhanVien{
    //Khai báo thêm thuộc tính ca
    //Ca 1: làm ngày
    //Ca 2: làm đêm
    protected int ca;
    public NhanVienDiCa(String ten, String queQuan, int cccd) {

        super(ten, queQuan, cccd);
    }

    public NhanVienDiCa(String ten, String queQuan, int cccd,int ca) {
        super(ten, queQuan, cccd);
        this.ca = ca;
    }

    @Override
    public double tinhLuong() {

        return luongCoBan*1.05; //Cao h[n 5% so với nvhc
    }
}
