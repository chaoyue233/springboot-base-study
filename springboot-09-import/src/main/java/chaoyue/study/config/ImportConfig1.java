package chaoyue.study.config;

import chaoyue.third.domain.OtherUser1;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 使用Import直接导入类进IoC容器
 * 这个类也可以是第三方的
 */
@Configuration
@Import(OtherUser1.class)
public class ImportConfig1 {
}
