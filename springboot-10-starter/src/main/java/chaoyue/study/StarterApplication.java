package chaoyue.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class StarterApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StarterApplication.class, args);
        Jedis jedis = context.getBean(Jedis.class);
        jedis.set("k1", "v1");
        System.out.println(jedis.get("k1"));
        jedis.del("k1");
    }
}
