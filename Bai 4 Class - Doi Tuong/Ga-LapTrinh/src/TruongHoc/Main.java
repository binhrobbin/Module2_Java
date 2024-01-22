package TruongHoc;

import TruongHoc.SinhVien;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    SinhVien sv1 = new SinhVien();
    SinhVien sv2 = new SinhVien();
    sv1.hienThiThongTin();
    sv2.hienThiThongTin();
    SinhVien sv3 = new SinhVien("Tèo");
            sv3.hienThiThongTin();
    SinhVien sv4 = new SinhVien("bình",9);
    sv4.hienThiThongTin();
//    sv4.hoTen = "Obaaaa";
//    sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        sv4.setHoTen("Black");
        sv4.setDiem(3.5);
        sv4.hienThiThongTin();
        //Test phương thức có kiểu trả về
        double dtbsv4 = sv4.tinhDiemTB(3,5.4);
        System.out.println(dtbsv4);

        sv4.hienThiThongTin();
        //Test phương thức toString;
        System.out.println(sv4);
        //Support method và Service method
        sv4.checkHopLeDiem();
        sv4.setDiem(30);
        sv4.checkHopLeDiem();

        // Overloading
        double testD = sv4.tinhDiemTB(5.6,6,7);
        System.out.println(testD);
        double testD2 = sv4.tinhDiemTB(5,6);
        System.out.println(testD2);

        System.out.println("tong diem arr là "+ sv4.tongDiem(34,5,6,2,34,6,7,834,3));
        System.out.println("tong diem arr là "+ sv4.tongDiem(34,5,6,2,34,6,7,834,3,3,2,5,65));
    }
}