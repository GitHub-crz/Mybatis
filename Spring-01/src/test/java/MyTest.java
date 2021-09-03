import com.crz.dao.UserDaoImolOracle;
import com.crz.dao.UserDaoImplMysql;
import com.crz.service.UserService;
import com.crz.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        UserService userService=(UserService) context.getBean("userservice");
        userService.getUser();
    }
}
