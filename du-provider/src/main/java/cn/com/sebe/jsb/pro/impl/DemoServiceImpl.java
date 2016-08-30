package cn.com.sebe.jsb.pro.impl;

import cn.com.sebe.jsb.pro.DemoService;
import cn.com.sebe.jsb.pro.User;

import java.util.ArrayList;
import java.util.List;

//service impl
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        System.out.print("server 1 response.");
        return "Hello " + name;
    }
    public List<User> getUsers() {
        System.out.print("server 1 response.");
        List<User> list = new ArrayList<User>();
        User u1 = new User();
        u1.setName("wolfman");
        u1.setAge(4);
        u1.setSex("男");

        User u2 = new User();
        u2.setName("titan");
        u2.setAge(22);
        u2.setSex("女");

        list.add(u1);
        list.add(u2);
        return list;
    }
}