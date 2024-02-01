public class TapChi extends ThuVien{
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(String tenNXB, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(tenNXB, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
        tapchiID ++;
        String ma = Integer.toString(tapchiID);
        maTL = "TC"+ma;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi {" +super.toString()+
                " soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh=" + thangPhatHanh +
                "} ";
    }
}
