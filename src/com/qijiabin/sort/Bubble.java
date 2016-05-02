package com.qijiabin.sort;

/**
 * ========================================================
 * 日 期：2016年5月2日 下午5:30:44
 * 作 者：jackson
 * 版 本：1.0.0
 * 类说明：冒泡排序
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
public class Bubble {

	public static void bubbleSort(int[] arr) {
		int temp;	//临时变量
		for (int i = 0; i < arr.length - 1; i++) {	//趟数，一共arr.length-1次
			for (int j = arr.length - 1; j > i; j--) {
				
				if (arr[j] < arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	
	public static void bubbleSort2(int[] arr) {
		int temp;	//临时变量
		boolean flag;	//是否交换的标志
		for (int i = 0; i < arr.length - 1; i++) {	//趟数，一共arr.length-1次
			
			flag = false;
			for (int j = arr.length - 1; j > i; j--) {
				
				if (arr[j] < arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					flag = true;
				}
			}
			
			if (!flag) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3, 1, 5, 8, 4, 9, 2};
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
}
