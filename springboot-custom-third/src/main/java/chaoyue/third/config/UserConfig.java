package chaoyue.third.config;

import chaoyue.third.domain.MyUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public MyUser myUser() {
        return new MyUser();
    }
}
