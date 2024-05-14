package chaoyue.autoconfigure.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
@EnableConfigurationProperties(MyRedisProperties.class) // 引入配置文件映射对象
public class MyRedisAutoConfiguration {
    @Bean
    public Jedis jedis(MyRedisProperties properties) {
        Jedis jedis = new Jedis(properties.getHost(), properties.getPort());
        jedis.auth(properties.getPassword());
        System.out.println("自定义Starter配置加载成功：" + properties);
        return jedis;
    }
}
