package chaoyue.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 最简单的SpringBoot项目demo hello-world
 */
@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConfigApplication.class, args);
        String port = context.getEnvironment().getProperty("server.port");
        System.out.println("port: " + port);
    }
}
