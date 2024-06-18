package dto;

import model.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RoomDTO {
    private static final File file = new File("data/rooms.csv");
    public static List<Room> readFile(){
        List<Room> roomsInFile = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                String[] data = line.split(", ");
                Room room = new Room(Integer.parseInt(data[0]),data[1],Double.parseDouble(data[2]),Integer.parseInt(data[3]),Integer.parseInt(data[4]),data[5]);
                roomsInFile.add(room);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("lỗi đọc");
        }
        return roomsInFile;
    }
    public static void writeFile(List<Room> listWriteFile){
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "id, tên phòng, giá, sl phòng tắm, sl phòng ngủ, trạng thái\n";
            for (Room u: listWriteFile){
                data += u.getId()+", "+u.getRoomName()+", "+u.getPrice()+", "+u.getAmountBathroom()+", "+u.getAmountBedroom()+ ", "+u.getStatus()+"\n";
            }
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("lỗi ghi file");
        }
    }
}
