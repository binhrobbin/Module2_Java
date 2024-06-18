package dto;

import model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserDTO {
    private static final File file = new File("data/user.csv");
    public static List<User> readFile(){
        List<User> usersInFile = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(", ");
                User user = new User(Integer.parseInt(data[0]),data[1],data[2],data[3]);
                usersInFile.add(user);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("lỗi đọc file");
        }
        return usersInFile;
    }
    public static void writeFile(List<User> listWriteFile){
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "id, tên tk, mật khẩu, quyền\n";
            for (User u: listWriteFile){
                data += u.getId()+", "+ u.getUserName()+", "+u.getPassword()+", "+u.getPermission()+"\n";
            }
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("lỗi ghi file");
        }
    }
}
