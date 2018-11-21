package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2018/10/31 16:58.
 * @Created by zhaotz1
 */
public class People {

    private String location;
    private List<User> userList = new ArrayList<>();


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<User> getUserList() {
        return userList;
    }

    @Override
    public String toString() {
        return "People{" +
                "location='" + location + '\'' +
                ", userList=" + userList +
                '}';
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }


}
