package czy.demo.reflect.generic;


import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class Pair<T> {

    private T[] array;

    public T get(int index){
        return array[index];
    }

    public static void main(String[] args){
        TypeVariable[] types = Pair.class.getTypeParameters();
        for(TypeVariable v:types){
            say("泛型类型变量名称为: "+v.getName());
            for(Type t:v.getBounds()){
                say("    子类限定为: "+t.getTypeName());
            }
        }

    }

    public static void say(Object o){
        System.out.println(o);
    }


}
