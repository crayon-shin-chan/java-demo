package czy.demo.structure.array;

/* 数组克隆测试，主要测试克隆后元素是否克隆 */
public class CloneTest {

    /* 数组克隆为浅克隆，元素引用不变 */
    public static void main(String[] args){
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9};
        Integer[] arr1 = arr.clone();

        System.out.println("克隆后数组引用是否相等："+(arr == arr1));
        System.out.println("克隆后数组元素引用是否相等："+(arr[0] == arr1[0]));
    }

}
