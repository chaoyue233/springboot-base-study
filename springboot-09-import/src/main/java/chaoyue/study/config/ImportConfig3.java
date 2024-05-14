package chaoyue.study.config;

import chaoyue.study.registrar.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 使用Import导入ImportBeanDefinitionRegistrar实现类，直接把BeanDefinition注册进去
 */
@Configuration
@Import(MyImportBeanDefinitionRegistrar.class)
public class ImportConfig3 {
}
