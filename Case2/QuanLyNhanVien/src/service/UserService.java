package service;

import dto.UserDTO;
import model.User;
import java.util.Collections;
import java.util.List;

public class UserService {
    private List<User> userList = UserDTO.readFile();
    public static User currentUser = null;

    public boolean checkLogin(User user) {
        for (User u : userList) {
            if (u.getUserName().equals(user.getUserName()) && u.getPassword().equals(user.getPassword())) {
                currentUser = u;
                return true;
            }
        }
        return false;
    }
    public boolean checkPermision(User user) {
        Collections.sort(userList);
        UserDTO.writeFile(userList);
        for (User u : userList) {
            if (u.getUserName().equals(user.getUserName()) && u.getPassword().equals(user.getPassword())) {
                if (u.getPermission().equals("admin")) return true;
            }
        }
        return false;
    }

    public boolean checkUserName(String userName) {
        for (User user : userList) {
            if (user.getUserName().equals(userName)) {
                System.out.println("... tên tài khoản bị trùng, hãy nhập id khác!");
                return true;
            }
        }
        return false;
    }
    public void register(User newUser){
        userList.add(newUser);
        Collections.sort(userList);
        UserDTO.writeFile(userList);
        System.out.println("... Đăng kí tài khoản thành công");
    }
    public void delete(int index) {
        userList.remove(index);
        UserDTO.writeFile(userList);
        System.out.println("... Xóa tài khoản thành công");
    }
    public void logout(){
        currentUser = null;
    }
    public boolean checkPassword(String password){
        userList = UserDTO.readFile();
        if (currentUser.getPassword().equals(password)){
            return true;
        }
        System.out.println("... Sai mật khẩu!!!");
        return false;
    }
    public void changePass(String newPass){
        currentUser.setPassword(newPass);
        System.out.println("... Sửa mật khẩu thành công");
        for (int i = 0; i < userList.size(); i++) {
            if(userList.get(i).getId()==currentUser.getId()){
                userList.set(i,currentUser);
                UserDTO.writeFile(userList);
            }
        }
    }
    public String getUsernameByID(int id){
        String username = null;
        for (User u:userList) {
            if (u.getId() == id) username = u.getUserName();
        }return username;
    }
    public String getPassByID(int id){
        String pass = null;
        for (User u:userList) {
            if (u.getId() == id) pass = u.getUserName();
        }return pass;
    }
    public String getPermissionByID(int id){
        String permission = null;
        for (User u:userList) {
            if (u.getId() == id) permission = u.getUserName();
        }return permission;
    }
    public int findByID(int id) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
}
