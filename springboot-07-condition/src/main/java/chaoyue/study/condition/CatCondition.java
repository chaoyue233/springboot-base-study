package chaoyue.study.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 判断当前类路径下是否有Home
 * 如果有Home才能创建Cat，否则不能创建
 */
public class CatCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        try {
            Class.forName("chaoyue.study.domain.Home");
        } catch (ClassNotFoundException e) {
            return false;
        }
        return true;
    }
}
