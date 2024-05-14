package chaoyue.study;

import chaoyue.third.config.EnableMyUser;
import chaoyue.third.domain.OtherUser1;
import chaoyue.third.domain.OtherUser2;
import chaoyue.third.domain.OtherUser3;
import chaoyue.third.domain.OtherUser4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// 使用Import的方式导入，需要三方配置类的Class 代码侵入性太强
// @ComponentScan("chaoyue.third")

// 使用Import的方式导入，需要三方配置类的Class 代码侵入性太强
// @Import(UserConfig.class)

// jar提供方提供@EnableXxx注解来进行汇总，让业务调用方与具体的配置类解耦（一般使用这种方式）
@EnableMyUser
@SpringBootApplication
public class ImportApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ImportApplication.class, args);
        System.out.println(context.getBean("myUser"));
        System.out.println(context.getBean(OtherUser1.class));
        System.out.println(context.getBean(OtherUser2.class));
        System.out.println(context.getBean(OtherUser3.class));
        System.out.println(context.getBean(OtherUser4.class));
    }
}
