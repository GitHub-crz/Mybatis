import com.crz.pojo.Hello;
import com.crz.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Hello hello=(Hello)context.getBean("hello");
        System.out.println(hello.toString());
        User user1=(User)context.getBean("user1");
        user1.show();
    }
}
