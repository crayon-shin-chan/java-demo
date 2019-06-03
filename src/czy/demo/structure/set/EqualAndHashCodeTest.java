package czy.demo.structure.set;

import java.util.HashSet;
import java.util.Set;

/* Set默认使用equal与hashCode方法判断元素是否相等
 * 只有当equals与hashCode都相等时才会认为两元素相等，可以进行覆盖
 */
public class EqualAndHashCodeTest {

    public static void main(String[] args){
        Set<User> set = new HashSet<>();

        set.add(new User("张三",1));
        set.add(new User("李四",2));
        System.out.println(set);

        /* name相等，不覆盖 */
        set.add(new User("张三",3));
        System.out.println(set);

        /* age相等，覆盖 */
        set.add(new User("王五",1));
        System.out.println(set);

        /* 移除元素时也是根据hashCode与equals操作的 */
        set.remove(new User("黑六",1));
        System.out.println(set);
    }

    private static class User{

        public User(String name,int age) {
            this.name = name;
            this.age = age;
        }

        private String name;
        private int age;


        /* 在这里重写了equal方法，只有age相等才认为是相等 */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;
            User user = (User)o;
            return age == user.age;
        }

        /* hashCode也是只由age决定 */
        @Override
        public int hashCode(){
            return age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
