package com.qijiabin.sort;

/**
 * ========================================================
 * 日 期：2016年6月5日 下午4:31:07
 * 作 者：jackson
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
public class Insert {
	
	public static void insertSort(int[] arr) {
		int temp;
		for (int i = 0, len = arr.length; i < len - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				} else {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] {3, 1, 5, 8, 4, 9, 2};
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		insertSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
}
