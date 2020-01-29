package czy.demo.sun.misc;

import sun.misc.ASCIICaseInsensitiveComparator;

/**
 * 忽略大小写比较
 */
public class ASCIICaseInsensitiveComparatorTest {

    public static void main(String[] args) {

        ASCIICaseInsensitiveComparator comparator = new ASCIICaseInsensitiveComparator();

        System.out.println(comparator.compare("a","A"));
        System.out.println(comparator.compare("aCB","Acb"));
    }

}
