package dto;

import model.Product;
import model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserDTO {
    private static final File file = new File("data/account.csv");
    public static List<User> readFile(){
        List<User> usersInFile = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(",");
                User user = new User(data[0],data[1],data[2]);
                usersInFile.add(user);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return usersInFile;
    }
    public static void writeFile(List<User> listWriteFile){
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "";
            for (User user: listWriteFile){
                data += user.getUserName()+","+user.getPassword()+","+user.getMobileNumber()+"\n";
            }
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
