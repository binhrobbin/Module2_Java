package dto;

import model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserDTO {
    private static final File file = new File("data/users.csv");
    public static List<User> readFile(){
        List<User> usersInFile = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(", ");
                User user = new User(data[0],data[1],data[2],Integer.parseInt(data[3]),data[4],data[5],data[6]);
                usersInFile.add(user);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("lỗi đọc");
        }
        return usersInFile;
    }
    public static void writeFile(List<User> listWriteFile){
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "tên tk, mật khẩu, tên, tuổi, sdt, địa chỉ, email\n";
            for (User u: listWriteFile){
                data += u.getUserName()+", "+u.getPassword()+", "+u.getName()+", "+u.getAge()+
                        ", "+u.getMobileNumber()+", "+u.getAddress()+", "+u.getEmail()+"\n";
            }
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("lỗi ghi file");
        }
    }
}
