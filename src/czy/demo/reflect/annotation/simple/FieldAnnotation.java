package czy.demo.reflect.annotation.simple;

import java.lang.annotation.*;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FieldAnnotation {

    String name() default "呵呵";

    String value() default "我是默认值";
}
