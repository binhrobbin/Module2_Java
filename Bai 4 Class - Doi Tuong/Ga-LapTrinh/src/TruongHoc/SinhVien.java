package TruongHoc;

public class SinhVien {
    private String hoTen;
    private double diem;
    public SinhVien(){
        hoTen = "No name";
        diem = 0.0;
    }
    public SinhVien(String hoTen){
        this.hoTen = hoTen;
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public void hienThiThongTin(){
        System.out.println(hoTen+" : "+diem);
    }
    public double tinhDiemTB(double toan, double van){
        return (toan+van) /2;
    }

    //PT 2
    public double tinhDiemTB(double toan, double van, double anh){
        return (toan+van+anh) /3;
    }
    //PT 3
    public double tinhDiemTB(float toan, double van, double anh){
        return (van+anh) /3;
    }
    //PT 4
    public double tinhDiemTB(float toan, double van, String anh){
        return toan;
    }
    //PT 5
    public double tinhDiemTB(String anh,float toan, double van ){
        return toan;
    }


    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }
    // suport method chỉ hỗ trợ trong class dùng private
    private boolean checkDiem(){
        return this.diem>=24;
    }

    // sevice method có thể gọi từ chương trình chính
    public void checkHopLeDiem(){
        if (checkDiem())
            System.out.println("Điểm "+this.diem+" hợp lệ, tiếp tục nhập thông tin");
        else
            System.out.println("Điểm KO hợp lệ");
    }
    //parameter list
    public double tongDiem(double ... arr){
        double tong = 0.0;
        for (double x: arr){
            tong +=x;
        }
        return tong;
    }
}
