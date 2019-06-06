package czy.demo.lang.annotation.simple;

import java.lang.annotation.*;

/* Target为注解可以应用的目标
 * TYPE：接口、类、枚举、注解，如Controller、Component、Service
 * FIELD：字段、枚举的常量，如Autowired
 * METHOD：方法，但不包括构造函数，如Cachable
 * PARAMETER：方法参数，如RequestParam
 * CONSTRUCTOR：构造函数，Autowired
 * LOCAL_VARIABLE：局部变量，如SuppressWarnings
 * ANNOTATION_TYPE：在注解上使用的注解，如Target、Retention、Documented等元注解
 * */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ClassAnnotation {

    String name() default "呵呵";

    String value() default "我是默认值";
}
