package chaoyue.study;

import chaoyue.study.domain.Cat;
import chaoyue.study.domain.Dog;
import chaoyue.study.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConditionApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConditionApplication.class, args);
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(Cat.class));
        System.out.println(context.getBean(Dog.class));
    }
}