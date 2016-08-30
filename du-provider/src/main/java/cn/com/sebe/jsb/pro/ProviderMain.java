package cn.com.sebe.jsb.pro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wild on 16-8-30.
 */public class ProviderMain {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        context.start();

        System.out.println("server 01 started.");
        System.in.read();
    }

}