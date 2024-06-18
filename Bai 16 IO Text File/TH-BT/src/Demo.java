import sun.security.util.Length;

import java.io.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws Exception {
        File file = new File("demo.txt");
//        file.createNewFile();
//        System.out.println("Path: "+file.getAbsolutePath());  //Lấy đường dẫn tuyệt đối
//        System.out.println("Is file: "+file.isFile());
//        Date date = new Date(file.lastModified());
//        Format format = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
//        System.out.println("LastModified: "+format.format(date));
//        System.out.println("Length: "+ file.length());
//        file.delete();

        // Thư mục
//        File file1 = new File("data");
//        file1.mkdir();
//
//        File file2 = new File("data/demo.txt");
//        file2.createNewFile();

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello C12");
        bufferedWriter.close();
//        file.delete();

//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line;
//        while ((line = bufferedReader.readLine()) !=null){
//            System.out.println(line);
//        }
    }
}
