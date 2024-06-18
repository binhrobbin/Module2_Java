

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private String gender;
    private double toan;
    private double van;
    private double anh;
    private double dtb;
    static int countId = 0;

    public Student(String name, String gender, double toan, double van, double anh) {
        this.name = name;
        this.gender = gender;
        this.toan = toan;
        this.van = van;
        this.anh = anh;
        countId++;
        this.id = countId;
        this.dtb = (toan+van+anh)/3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getAnh() {
        return anh;
    }

    public void setAnh(double anh) {
        this.anh = anh;
    }

    public double getDTB() {
        return dtb;
    }

    public void setDTB(double dtb) {
        this.dtb = dtb;
    }

    @Override
    public String toString() {
        return id + ". name: " + name + ", gender: " + gender + ", ĐTB: " + dtb;
    }

    @Override
    public int compareTo(Student o) {
        if (this.dtb < o.dtb) return 1;
        else if (this.dtb > o.dtb) return -1;
        else return 0;
    }
}
