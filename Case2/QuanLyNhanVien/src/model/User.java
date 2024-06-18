package model;

public class User implements Comparable<User>{
    private int id;
    private String userName;
    private String password;
    private String permission;

    public User(int id, String userName, String password, String permission) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.permission = permission;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
    @Override
    public int compareTo(User o) {
        if (id>o.getId()) return 1;
        else if (id<o.getId()) return -1;
        else return 0;
    }
}
