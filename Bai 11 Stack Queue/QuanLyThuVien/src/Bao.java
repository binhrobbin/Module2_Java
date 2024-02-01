public class Bao extends ThuVien{
    private int ngayPhatHanh;

    public Bao(String tenNXB, int soBanPhatHanh, int ngayPhatHanh) {
        super(tenNXB, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
        baoID ++;
        String ma = Integer.toString(baoID);
        maTL = "B"+ma;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao {" +super.toString()+
                " ngayPhatHanh=" + ngayPhatHanh +
                "} ";
    }
}
