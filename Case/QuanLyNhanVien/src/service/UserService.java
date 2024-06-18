package service;

import dto.UserDTO;
import model.User;

import java.util.ArrayList;
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

    public boolean checkUserName(String userName) {
        for (User user : userList) {
            if (user.getUserName().equals(userName)) {
                System.out.println("... Tài khoản đã tồn tại");
                return true;
            }
        }
        return false;
    }
    public void register(User newUser){
        userList.add(newUser);
        UserDTO.writeFile(userList);
        System.out.println("... Đăng kí thành công");
    }
    public boolean getPassword(String username, String mobileNumber){
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUserName().equals(username) && userList.get(i).getMobileNumber().equals(mobileNumber)){
                System.out.println("...Mật khẩu của bạn là: "+userList.get(i).getPassword());
                return true;
            }
        }
        System.out.println("... Sai tên tài khoản hoặc số điện thoại !!!");
        return false;
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
    public void changeMobileNumber(String newMobileNumber){
        currentUser.setMobileNumber(newMobileNumber);
        System.out.println("... Sửa số điện thoại thành công");
        for (int i = 0; i < userList.size(); i++) {
            if(userList.get(i).getId()==currentUser.getId()){
                userList.set(i,currentUser);
                UserDTO.writeFile(userList);
            }
        }
    }
}
