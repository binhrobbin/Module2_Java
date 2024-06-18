package model;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private String mobileNumber;
    private String address;
    private String email;
    private String type;
    private boolean status;
    private int workday;
    private User user;

    public Employee(int id, String name, int age, String mobileNumber, String address, String email, String type, boolean status, int workday,User user) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.email = email;
        this.type = type;
        this.status = status;
        this.workday = workday;
        this.user = user;
    }

    public int getWorkday() {
        return workday;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return '{'+(id-123) +", "+ name+", " + age+", " +mobileNumber+", " +address+", " +email+", " +status+", " +type+", " +workday +'}';
    }

//    @Override
//    public int compare(User o1, User o2) {
//        if (o1.getId()>o2.getId()) return 1;
//        else if (o1.getId()<o2.getId()) return -1;
//        else return 0;
//    }

    @Override
    public int compareTo(Employee o) {
        if (id>o.getId()) return 1;
        else if (id<o.getId()) return -1;
        else return 0;
    }
}
