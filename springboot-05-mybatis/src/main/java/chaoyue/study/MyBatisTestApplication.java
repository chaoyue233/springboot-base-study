package chaoyue.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("chaoyue.study.mapper") // 指定mapper接口扫描包路径
@SpringBootApplication
public class MyBatisTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBatisTestApplication.class, args);
    }
}
