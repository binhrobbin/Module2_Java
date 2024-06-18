import java.io.*;

public class IO_File {
    public static void main(String[] args) throws IOException {
//        File file = new File("demo.txt.txt");
//        //file.createNewFile(); // Tạo file
//        System.out.println("Path: " + file.getAbsolutePath()); // Lấy đường dẫn tuyệt đối
//        System.out.println("Is File: " + file.isFile());
//        Date date = new Date(file.lastModified());
//        Format format = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
//        System.out.println("LastModified: " + format.format(date));
//        System.out.println("Length: " + file.length());
//        file.delete();

//        File file = new File("data");
//        file.mkdirs();

//        File file = new File("data/demo.txt.txt");
//        file.createNewFile();


        File file = new File("demo.txt.txt");
//        FileWriter fileWriter = new FileWriter(file);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write("Hello C1123G1");
//        bufferedWriter.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
