package chaoyue.study;

import chaoyue.study.mapper.UserXmlMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserXmlMapperTest {
    @Autowired
    private UserXmlMapper userMapper;

    @Test
    public void findAllTest() {
        System.out.println(userMapper.findAll());
    }
}
