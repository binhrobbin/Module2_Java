package bt2;

import java.io.*;

public class Read_CSV_File {
    public static void main(String[] args) {
        File file = new File("src/bt2/file.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            System.out.println("Danh sách thành phố là: ");
            while ((line = bufferedReader.readLine()) != null){
                String[] str= line.split(",");
                System.out.println(str[0]+"-"+str[1]+"-"+str[2]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
