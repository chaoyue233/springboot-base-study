package chaoyue.study;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test1() {
        redisTemplate.opsForValue().set("k1", "v1");
        System.out.println(redisTemplate.opsForValue().get("k1"));
        redisTemplate.delete("k1");
    }

    @Test
    public void test2() {
        redisTemplate.boundValueOps("k1").set("v1");
        System.out.println(redisTemplate.boundValueOps("k1").get());
        redisTemplate.delete("k1");
    }
}
