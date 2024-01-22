package TinhDaHinh;

public class Test {
    public static void main(String[] args) {
        TruongPhong tp1 = new TruongPhong();
        //Hiển thị khi có toString() ghi đè ở lớp con Trưởng phòng
        System.out.println(tp1);

        //hien gợi ý Ctrl + P
        NhanSu pp1 = new PhoPhong("phó phòng 1", 321,"HB");

        //Xuất lương và tên phó phòng
        System.out.println("luong pp: "+ pp1.tinhLuong(23));
        //Hiển thị khi có toString() ở lớp cha, bt chỉ hiển thị địa chỉ của đối tượng pp1
        System.out.println(pp1);

        //thay đổi chức vụ
        pp1 = new TruongPhong(pp1.getTen(), pp1.getCccd(), pp1.getQueQuan());

        //in lương và tên pp1 sau khi chuyển thành tp
        System.out.println("luong tp: "+ pp1.tinhLuong(23));
        System.out.println(pp1);

        final int a = 5;

    }
}
