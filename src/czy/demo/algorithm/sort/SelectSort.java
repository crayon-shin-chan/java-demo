package czy.demo.algorithm.sort;
import java.util.Random;

public class SelectSort {

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int[] arr = new int[20];

        Random rm = new Random(112121);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rm.nextInt(1000);
        }

        System.out.println("原数组为:");
        printArr(arr);

        /* 这里的基本思路是一遍一遍的查找最大值
         * 每一遍获取一个范围内的最大值的下标，然后将最大值与这个范围头部元素交换
         *
         * */
        for (int i = arr.length-1; i>0; i--) {
            int max = i;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

        System.out.println("排序后数组为:");
        printArr(arr);
    }

}