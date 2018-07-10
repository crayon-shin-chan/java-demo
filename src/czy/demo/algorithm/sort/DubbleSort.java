package czy.demo.algorithm.sort;

import java.util.Random;

public class DubbleSort {
	
	public static void printArr(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();

	}

	public static void main(String[] args) {

		int[] arr = new int[20];

		Random rm = new Random(1121212);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rm.nextInt(1000);
		}
		
		System.out.println("原数组为:");
		printArr(arr);

		/*这里的基本思路是一遍一遍的冒泡
		 * 每一次冒泡开始下标都是0;结束下标依次减小
		 * 由i来控制每一次冒泡的结束下标,这里需要注意j是小于i的,而下标最大为j+1,所以i不能等于数组长度
		 * 由j来控制每一次冒泡过程中参数比较元素的下标,从0开始,到i-1结束
		 * */
		for (int i = arr.length-1; i>0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("排序后数组为:");
		printArr(arr);
	}

}
