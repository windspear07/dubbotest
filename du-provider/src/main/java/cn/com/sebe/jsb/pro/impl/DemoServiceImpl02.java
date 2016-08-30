package cn.com.sebe.jsb.pro.impl;

import cn.com.sebe.jsb.pro.DemoService;
import cn.com.sebe.jsb.pro.User;

import java.util.ArrayList;
import java.util.List;

//service impl
public class DemoServiceImpl02 implements DemoService {

    public String sayHello(String name) {
        System.out.print("server 2 response.");
        return "Hello " + name + " 02";
    }
    public List<User> getUsers() {
        System.out.print("server 2 response.");
        List<User> list = new ArrayList<User>();
        User u1 = new User();
        u1.setName("wolfman 02");
        u1.setAge(4);
        u1.setSex("男 02");

        User u2 = new User();
        u2.setName("titan 02");
        u2.setAge(22);
        u2.setSex("女 02");

        list.add(u1);
        list.add(u2);
        return list;
    }
}