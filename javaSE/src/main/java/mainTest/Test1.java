package mainTest;

import model.People;
import model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2018/10/31 17:00.
 * @Created by zhaotz1
 */
public class Test1 {


    public static void main(String[] args) {
        User u = new User();
        u.setName("张三1");
        u.setAge("20");
        User u2 = new User();
        u2.setName("张三2");
        u2.setAge("20");
        User u3 = new User();
        u3.setName("张三3");
        u3.setAge("20");
        User u4 = new User();
        u4.setName("张三4");
        u4.setAge("20");
        User u5 = new User();
        u5.setName("张三5");
        u5.setAge("20");

        List<User> ulist = new ArrayList<>();
        ulist.add(u);
        ulist.add(u2);
        ulist.add(u3);
        ulist.add(u4);
        ulist.add(u5);


        People p =  new People();
        p.setLocation("北京");
        p.setUserList(ulist);


        List<User> userList = p.getUserList();
        for (User user : userList) {
            user.setAge("10000");
        }


        System.out.println(p);





    }

}
