package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();

        User u1 = new User();
        u1.setAge(26);
        u1.setName("Tung");
        u1.setAccount("tung");
        u1.setEmail("aprilerd34@gmail.com");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(28);
        u2.setName("Du");
        u2.setAccount("du");
        u2.setEmail("dusida@gmail.com");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(25);
        u3.setName("Quy");
        u3.setAccount("quy");
        u3.setEmail("quygiangmai@gmail.com");
        u3.setPassword("123456");
        users.add(u3);

        User u4 = new User();
        u4.setAge(24);
        u4.setName("Hoang");
        u4.setAccount("hoang");
        u4.setEmail("hoangdandon@gmail.com");
        u4.setPassword("123456");
        users.add(u4);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
