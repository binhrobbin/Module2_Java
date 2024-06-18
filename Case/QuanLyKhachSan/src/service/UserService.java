package service;

import dto.UserDTO;
import model.User;

import java.util.List;

public class UserService {
    private List<User> userList = UserDTO.readFile();
    public static User currenUser = null;
    public boolean checkLogin(User user){
        for (User u:userList){
            if (u.getUserName().equals(user.getUserName()) && u.getPassword().equals(user.getPassword())){
                currenUser = u;
                return true;
            }
        }return false;
    }
    public boolean checkUserName(String userName){
        for (User user:userList){
            if (user.getUserName().equals(userName)){
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
}
