package com.qijiabin.sort;

/**
 * ========================================================
 * 日 期：2016年5月2日 下午5:48:55
 * 作 者：jackson
 * 版 本：1.0.0
 * 类说明：选择排序
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
public class Select {
	
	public static void selectSort(int[] arr) {
		int temp, k;
		for (int i = 0; i < arr.length - 1; i++) {
			k = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[k]) {
					k = j;
				}
			}
			
			if (k != i) {
				temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3, 1, 5, 8, 4, 9, 2};
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		selectSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
}
