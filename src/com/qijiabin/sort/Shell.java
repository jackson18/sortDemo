package com.qijiabin.sort;

/**
 * ========================================================
 * 日 期：2016年8月4日 下午10:07:29
 * 作 者：jackson
 * 版 本：1.0.0
 * 类说明：希尔排序
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
public class Shell {

	public static void shellSort(int[] arr) {
		int i,j,temp;
		int h = 1;
		
		while (h <= arr.length) {
			h = h*3 + 1;
		}
		
		while (h > 0) {
			for (i = h; i < arr.length; i++) {
				temp = arr[i];
				j = i;
				
				while (j > h - 1 && arr[j-h] >= temp) {
					arr[j] = arr[j-h];
					j = j - h;
				}
				
				arr[j] = temp;
			}
			h = (h - 1)/3;
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] {3, 1, 5, 8, 4, 9, 2};
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		shellSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
