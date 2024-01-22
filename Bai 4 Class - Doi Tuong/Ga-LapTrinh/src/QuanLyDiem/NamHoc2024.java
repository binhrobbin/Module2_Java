package QuanLyDiem;

public class NamHoc2024 {
    //Thuộc tính
    protected String name;
    protected double identity;

    public NamHoc2024(String name,double identity){
        this.name = name;
        this.identity = identity;
    }
//Phương thức
    public void tinhDTB(){
        System.out.println("Đây là phương thức tính điểm tb của lớp cha");
    }
}
