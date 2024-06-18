package model;

public class Room {
    private int id;
    private String roomName;
    private double price;
    private int amountBathroom;
    private int amountBedroom;
    private String status;

    public Room(int id, String roomName, double price, int amountBathroom, int amountBedroom, String status) {
        this.id = id;
        this.roomName = roomName;
        this.price = price;
        this.amountBathroom = amountBathroom;
        this.amountBedroom = amountBedroom;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmountBathroom() {
        return amountBathroom;
    }

    public void setAmountBathroom(int amountBathroom) {
        this.amountBathroom = amountBathroom;
    }

    public int getAmountBedroom() {
        return amountBedroom;
    }

    public void setAmountBedroom(int amountBedroom) {
        this.amountBedroom = amountBedroom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
