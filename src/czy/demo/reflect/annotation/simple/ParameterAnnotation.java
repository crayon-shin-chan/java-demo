package czy.demo.reflect.annotation.simple;

import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ParameterAnnotation {

    String name() default "呵呵";

    String value() default "我是默认值";
}
