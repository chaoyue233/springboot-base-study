package chaoyue.study.config;

import chaoyue.study.selector.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 使用Import导入ImportSelector实现类，一般用于加载配置文件中的类
 */
@Import(MyImportSelector.class)
@Configuration
public class ImportConfig2 {
}
