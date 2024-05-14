package chaoyue.study;

import chaoyue.study.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) //junit注解，整合Spring和JUnit
@SpringBootTest(classes = JunitTestApplication.class) // spring的注解，标识当前测试类需要依赖容器启动运行
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void addTest() {
        userService.add();
    }
}
