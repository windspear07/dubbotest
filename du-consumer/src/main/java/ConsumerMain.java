import cn.com.sebe.jsb.pro.DemoService;
import cn.com.sebe.jsb.pro.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by wild on 16-8-30.
 */
public class ConsumerMain {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService"); //
        String hello = demoService.sayHello("tom1"); // ִ
        System.out.println(hello); //

        //
        List<User> list = demoService.getUsers();
            for (User o : list) {
                System.out.println( "result : " + o.getName() + "," + o.getSex() + "," + o.getAge() );
        }
        // System.out.println(demoService.hehe());
        System.in.read();
    }

}