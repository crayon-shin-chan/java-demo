package czy.demo.lang.annotation.simple;

import java.lang.annotation.*;

@Target(ElementType.PACKAGE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PackageAnnotation {

    String name() default "呵呵";

    String value() default "我是默认值";
}
