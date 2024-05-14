package chaoyue.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 访问 http://localhost:8080/actuator 获取监控信息
 * 如果需要图形化界面，可以接入SpringBootAdmin 访问 http://localhost:9000 查看
 * 但实际基本不用，都是使用Prometheus + Grafana
 */
@SpringBootApplication
public class ActuatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class, args);
    }
}
