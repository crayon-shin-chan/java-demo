package czy.demo.util.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/* 测试用Unsafe对User对象取值 */
public class UserTest {

    private static Unsafe U;
    private static long idOffset;
    private static long ageOffset;
    private static long nameOffset;
    private static long tagsOffset;

    static {
        /* 只有引导类加载器和扩展类加载器加载的系统类才能使用Unsafe.getUnsafe获取Unsafe对象 */
        try {
            Field f= Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            U = (Unsafe) f.get(null);
            idOffset = U.objectFieldOffset(User.class.getDeclaredField("id"));
            ageOffset = U.objectFieldOffset(User.class.getDeclaredField("age"));
            nameOffset = U.objectFieldOffset(User.class.getDeclaredField("name"));
            tagsOffset = U.objectFieldOffset(User.class.getDeclaredField("tags"));
        }catch (Exception ex){

        }
    }

    public static void main(String[] args)throws Exception{
        System.out.println("id字段偏移为："+idOffset);
        System.out.println("age字段偏移为："+ageOffset);
        System.out.println("name字段偏移为："+nameOffset);
        System.out.println("tags字段偏移为："+tagsOffset);
        print(new User(89,121,"张三",new String[]{"游戏","电影","编程"}));

    }

    private static void print(User user){
        System.out.println("id："+U.getInt(user,idOffset));
        System.out.println("age："+U.getObject(user,ageOffset));
        System.out.println("name："+U.getObject(user,nameOffset));
        System.out.println("tags："+printArray((String[])U.getObject(user,tagsOffset)));
    }

    private static String printArray(String[] arr){
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for(int i=0;i<arr.length;i++){
            long offset = U.arrayBaseOffset(arr.getClass())+i*U.arrayIndexScale(arr.getClass());
            builder.append(U.getObject(arr,offset));
            if(i!=(arr.length-1)){
                builder.append(",");
            }
        }
        builder.append("]");
        return builder.toString();
    }

}
