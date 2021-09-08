import com.crz.pojo.UserService;
import com.crz.pojo.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=context.getBean("userservice", UserService.class);
        userService.add();
        //xmlns:context="http://www.springframework.org/schema/tool"
        //xmlns:aop="http://www.springframework.org/schema/c"
    }
}