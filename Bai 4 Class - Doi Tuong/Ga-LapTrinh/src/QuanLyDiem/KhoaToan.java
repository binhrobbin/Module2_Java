package QuanLyDiem;

public class KhoaToan extends NamHoc2024 {
    public KhoaToan(String name, double identity) {
        super(name, identity);
    }

    @Override
    public void tinhDTB() {
        System.out.println("Đây là điểm tb khoa toan");
    }
}
