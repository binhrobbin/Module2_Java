package QuanLyDiem;

public class TestDiem {
    public static void main(String[] args) {
        //Khởi tạo đối tượng
        KhoaToan toan1 = new KhoaToan("Toán 1",321);
        toan1.tinhDTB();

        KhoaAnh anh1 = new KhoaAnh("Anh 1",654);
        anh1.tinhDTB();

        KhoaSu su1 = new KhoaSu("Su 1", 654345);
        su1.tinhDTB();
    }
}
