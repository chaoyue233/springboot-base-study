package chaoyue.study.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 需要额外配置 META-INF/spring.factories 否则不起作用
 * 因为这个回调是在容器初始化的时候触发的，那时候单例Bean还没开始创建
 */
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        System.out.println("MyApplicationContextInitializer initialize()...");
    }
}
