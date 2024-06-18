package input;

import java.util.Scanner;

public class StudentValidator {
    private static Scanner scanner = new Scanner(System.in);
    public static int getID(){
        String regex = "[0-9]{2,}";
        while (true){
            String id = scanner.nextLine();
            if (id.matches(regex)){
                int ipOutput = Integer.parseInt(id);
                return ipOutput;
            }else System.out.println("ID có ít nhất 2 ký tự số");
        }
    }
    public static String getName(){
        String regex = "[a-zA-Z]{3,5}[0-9]+";
        while (true){
            String name = scanner.nextLine();
            if (name.matches(regex)){
                return name;
            }else System.out.println("3-5 ky tu chu va it nhat 1 ky tu so");
        }
    }
}
