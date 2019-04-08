package czy.demo.structure.set;

import java.util.HashSet;
import java.util.Set;

/* 测试是否按照哈希排序 */
public class SortTest {

    public static void main(String[] args){

        Set<User> set = new HashSet<>();

        /* 打印结果并不是按照哈希排序 */
        set.add(new User("张三",56));
        set.add(new User("李四",123));
        System.out.println(set);

        set.add(new User("张三",12));
        System.out.println(set);

        set.add(new User("王五",1));
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
