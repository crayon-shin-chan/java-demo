package czy.demo.lang.annotation.simple;

import java.lang.annotation.*;

@Target(ElementType.LOCAL_VARIABLE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LocalAnnotation {

    String name() default "呵呵";

    String value() default "我是默认值";
}
