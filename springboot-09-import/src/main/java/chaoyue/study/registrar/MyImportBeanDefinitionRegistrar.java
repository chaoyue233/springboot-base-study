package chaoyue.study.registrar;

import chaoyue.third.domain.OtherUser4;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        AbstractBeanDefinition beanDefinition =
                BeanDefinitionBuilder.rootBeanDefinition(OtherUser4.class).getBeanDefinition();
        beanDefinitionRegistry.registerBeanDefinition("otherUser4", beanDefinition);
    }
}
