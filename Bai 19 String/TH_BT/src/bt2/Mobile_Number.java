package bt2;

public class Mobile_Number {
    public static void main(String[] args) {
        String regex = "^[(]\\d{2}[)]-[(]0\\d{9}[)]$";
        String[] className = new String[]{"(84)-(0978489648)","(a8)-(22222222)","(84)-(22b22222)","(84)-(9978489648)","(8)-(078489648)"};
        for (String name: className){
            if (name.matches(regex)){
                System.out.println("Tên lớp: "+name+" hợp lệ");
            }else System.out.println("Tên lớp: "+name+" KO hợp lệ");
        }
    }
}