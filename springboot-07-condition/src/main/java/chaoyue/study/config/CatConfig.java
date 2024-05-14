package chaoyue.study.config;

import chaoyue.study.condition.CatCondition;
import chaoyue.study.domain.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CatConfig {

    /**
     * 原始的方式使用Conditional注解
     */
    @Conditional(CatCondition.class)
    @Bean
    public Cat cat() {
        return new Cat();
    }
}
