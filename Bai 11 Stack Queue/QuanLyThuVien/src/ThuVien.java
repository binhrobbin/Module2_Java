public abstract class ThuVien {
     String maTL;
    private String tenNXB;
    private int soBanPhatHanh;
    static int sachID = 0;
    static int baoID = 0;
    static int tapchiID = 0;
    public ThuVien(String tenNXB, int soBanPhatHanh) {
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {

        this.maTL = maTL;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String toString() {
        return "maTL='" + maTL + '\'' + ", tenNXB='" + tenNXB + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh;
    }
}
