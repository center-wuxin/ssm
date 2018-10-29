import com.wyp.pojo.User;
import com.wyp.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JunitTest {

    public static void main(String[] args){
        ApplicationContext spring = new ClassPathXmlApplicationContext("spring.xml");
        IUserService iUserService = spring.getBean(IUserService.class);
       //增加
//        User u = new User();
//        u.setUserName("tian");
//        u.setPassWord("123");
//        u.setAge(11);
//        int i = iUserService.addUser(u);
//        System.out.println(i);

        //查询
//        User user = iUserService.getUser(1);
//        System.out.println(user);

        //修改
//        User u = new User();
//        u.setUserId(1);
//        u.setUserName("pp");
//        u.setPassWord("333");
//        u.setAge(12);
//        int i = iUserService.editUserById(u);
//        System.out.println(i);

        //查询所有用户
        List<User> userList = iUserService.getAllUser();
        for(User u : userList){
            System.out.println(u);
        }

    }

}
