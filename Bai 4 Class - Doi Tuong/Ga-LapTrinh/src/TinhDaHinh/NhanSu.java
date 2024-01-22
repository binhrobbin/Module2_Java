package TinhDaHinh;

public abstract class NhanSu {
    //thêm các thuộc tính
    private String ten;
    private double cccd;
    private String queQuan;

    public NhanSu(String ten, double cccd, String queQuan) {
        this.ten = ten;
        this.cccd = cccd;
        this.queQuan = queQuan;
    }

    public NhanSu(String ten, double cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }

    public NhanSu() {
    }
    //phương thức tính lương
    public abstract double tinhLuong(int ngayCong);


    public String toString() {
        return "NhanSu {" +
                "ten='" + ten + '\'' +
                ", cccd=" + cccd +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }

    public String getTen() {
        return ten;
    }

    public double getCccd() {
        return cccd;
    }

    public String getQueQuan() {
        return queQuan;
    }
}
