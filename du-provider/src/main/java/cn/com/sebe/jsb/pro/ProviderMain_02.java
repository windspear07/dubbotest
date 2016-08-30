package cn.com.sebe.jsb.pro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wild on 16-8-30.
 */public class ProviderMain_02 {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext_02.xml"});
        context.start();

        System.out.println("server 02 started.");
        System.in.read();
    }

}