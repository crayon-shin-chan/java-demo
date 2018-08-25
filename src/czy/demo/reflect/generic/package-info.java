package czy.demo.reflect.generic;

/**
 * Java虚拟机对泛型具有类型擦除的特性,但是擦除的类依然保存一些泛型祖先的微弱记忆
 * 在类文件中,让泛型反射可以使用的类型信息与旧的虚拟机不兼容
 * 为了描述泛型类型声明,Java SE 5.0 在java.lang.reflect包中提供了一个eType接口,有以下子类型:
 * Class: 描述具体类
 * TypeVariable: 描述类型变量(如 T extends Comparable<? super T>)
 * WildcardType: 描述通配符(如 ? super T)
 * ParameterizedType: 描述泛型类或接口类型(如 Comparable<? super T>)
 * GenericArray: 描述泛型数组(如 T[])
 */
