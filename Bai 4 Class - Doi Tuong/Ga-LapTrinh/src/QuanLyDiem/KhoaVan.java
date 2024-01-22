package QuanLyDiem;

public class KhoaVan extends NamHoc2024{
    public KhoaVan(String name, double identity) {
        super(name, identity);
    }

    @Override
    public void tinhDTB() {
        System.out.println("Đây là dtb của khoa van");
    }
}
