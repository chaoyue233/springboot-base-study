package chaoyue.study.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"chaoyue.third.domain.OtherUser2", "chaoyue.third.domain.OtherUser3"};
    }
}
