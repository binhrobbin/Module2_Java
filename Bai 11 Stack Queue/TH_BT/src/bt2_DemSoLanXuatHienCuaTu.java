import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class bt2_DemSoLanXuatHienCuaTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuỗi: ");
        String str = scanner.nextLine();
        String str2 = "";
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            if ((String.valueOf(str.charAt(i)).equals(" ") && str2 != "") ||
                    String.valueOf(str.charAt(i)).equals(".") || String.valueOf(str.charAt(i)).equals(",") ){
                if (treeMap.containsKey(str2)){
                    treeMap.replace(str2, treeMap.get(str2)+1);
                }else treeMap.put(str2,1);
                str2 = "";
                continue;
            }
//            if (str.valueOf(str.charAt(i)).equals(" ") && str2 == "") continue;
//            if (String.valueOf(str.charAt(i)).equals(" ") && str2 == "") continue;
            if (str.charAt(i)==' ' && str2 == "") continue;
            str2 += String.valueOf(str.charAt(i));
            str2 = str2.toUpperCase();
        }
        System.out.println(treeMap.entrySet());
    }
}
