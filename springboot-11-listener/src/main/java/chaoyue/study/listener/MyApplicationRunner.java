package chaoyue.study.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 监听容器启动
 * 容器启动完成后调由容器调用Run方法
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        // 如果这里抛出异常，可以终止容器启动，比如检查资源是否可以连接
        // int i = 1 / 0;
        System.out.println("MyApplicationRunner run()...");
    }
}
