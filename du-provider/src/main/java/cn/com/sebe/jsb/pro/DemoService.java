package cn.com.sebe.jsb.pro;

import java.util.List;

//interface. it should be packaged to jar and transferred to consumer.
public interface DemoService {

    String sayHello(String name);

    List<User> getUsers();
}