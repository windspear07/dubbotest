package cn.com.sebe.jsb.pro;

import java.io.Serializable;

/**
 * Created by wild on 16-8-30.
 */
public class User implements Serializable{
    private String name;
    private String sex;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
