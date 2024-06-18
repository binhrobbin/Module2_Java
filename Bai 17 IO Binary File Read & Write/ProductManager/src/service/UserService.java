package service;

import dto.UserDTO;
import model.User;

import java.util.List;

public class UserService {
    public static int staticUserIndex =-1;
    private List<User> listUser = UserDTO.readFile();
    public boolean login(String username, String password){
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUserName().equals(username) && listUser.get(i).getPassword().equals(password)){
                System.out.println("... Login success");
                staticUserIndex = i;
                return true;
            }
        }
        System.out.println("... Wrong account!!!");
        return false;
    }
    public boolean addAccount(String newUserName, String newPassword,String newMobileNumber){
        for (User user:listUser){
            if (user.getUserName().equals(newUserName)){
                System.out.println("... Account already exists");
                return false;
            }
        }
        User user = new User(newUserName,newPassword,newMobileNumber);
        listUser.add(user);
        UserDTO.writeFile(listUser);
        System.out.println("... Create account success");
        return true;
    }
    public boolean getPassword(String username, String mobileNumber){
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUserName().equals(username) && listUser.get(i).getMobileNumber().equals(mobileNumber)){
                System.out.println("Your password is: "+listUser.get(i).getPassword());
                return true;
            }
        }
        System.out.println("... Wrong account or mobile number !!!");
        return false;
    }
    public boolean checkPassword(String password){
        listUser = UserDTO.readFile();
            if (listUser.get(staticUserIndex).getPassword().equals(password)){
                return true;
            }
        System.out.println("... Wrong password!!!");
        return false;
    }
    public void setPass(String newPass){
        listUser.get(staticUserIndex).setPassword(newPass);
        UserDTO.writeFile(listUser);
        System.out.println("... Set password success");
    }
    public void setMobileNumber(String newMobileNumber){
        listUser.get(staticUserIndex).setMobileNumber(newMobileNumber);
        UserDTO.writeFile(listUser);
        System.out.println("... Set mobile number success");
    }
}
