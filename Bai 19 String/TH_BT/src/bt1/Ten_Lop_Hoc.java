package bt1;

public class Ten_Lop_Hoc {
    public static void main(String[] args) {
        String regex = "^[CAP][0-9]{4}[GHIK]$";
        String[] className = new String[]{"C0223G","A0323K","M0318G","P0323A"};
        for (String name: className){
            if (name.matches(regex)){
                System.out.println("Tên lớp: "+name+" hợp lệ");
            }else System.out.println("Tên lớp: "+name+" KO hợp lệ");
        }
    }
}
