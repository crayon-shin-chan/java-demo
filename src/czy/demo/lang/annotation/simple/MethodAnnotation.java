package czy.demo.lang.annotation.simple;

import java.lang.annotation.*;

/* 只有RUNTIME策略的注解，可以在反射中获取到
 * SOURCE：只存在于源码中，字节码文件中不存在，如Override注解等
 * CLASS：存在于字节码中，但是运行时获取不到
 * RUNTIME：运行时可以通过反射获取
 * */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MethodAnnotation {

    String name() default "呵呵";

    String value() default "我是默认值";
}
