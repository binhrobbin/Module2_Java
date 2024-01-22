package CongTy;

public class Test {
    public static void main(String[] args) {
//        NhanVien nv1 = new NhanVien("Nhân viên 1", "HD", 123456);
//        System.out.println("Lương nv1 là: " + nv1.tinhLuong());

        //Tạo đối tượng là nv hành chính
        NhanVienHanhChinh nvhc1 = new NhanVienHanhChinh("hc1", "Hn", 3215);
        System.out.println("Lương nvhc1 là: " + nvhc1.tinhLuong());

//        Tạo nv đi ca
        NhanVienDiCa nvc1 = new NhanVienDiCa("ca1","QN",46546);
        System.out.println("Lương nvca là: " + nvc1.tinhLuong());
        NhanVienDiCa nvc2 = new NhanVienDiCa("ca2","QN",46546,1);
        System.out.println("Lương nvca2 là: " + nvc2.tinhLuong());
        System.out.println(nvc2.ca);

    }
}
