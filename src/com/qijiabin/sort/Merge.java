package com.qijiabin.sort;

/**
 * ========================================================
 * 日 期：2016年8月23日 下午4:12:21
 * 版 本：1.0.0
 * 类说明：归并排序
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
public class Merge {

	public static void merge_sort(int a[], int first, int last, int temp[]) {
		if (first < last) {
			int middle = (first + last) / 2;
			merge_sort(a, first, middle, temp);// 左半部分排好序
			merge_sort(a, middle + 1, last, temp);// 右半部分排好序
			mergeArray(a, first, middle, last, temp); // 合并左右部分
		}
	}

	/**
	 * 合并 ：将两个序列a[first-middle],a[middle+1-end]合并
	 * @param a
	 * @param first
	 * @param middle
	 * @param end
	 * @param temp
	 */
	public static void mergeArray(int a[], int first, int middle, int end, int temp[]) {
		int i = first;
		int m = middle;
		int j = middle + 1;
		int n = end;
		int k = 0;
		while (i <= m && j <= n) {
			if (a[i] <= a[j]) {
				temp[k] = a[i];
				k++;
				i++;
			} else {
				temp[k] = a[j];
				k++;
				j++;
			}
		}
		while (i <= m) {
			temp[k] = a[i];
			k++;
			i++;
		}
		while (j <= n) {
			temp[k] = a[j];
			k++;
			j++;
		}

		for (int ii = 0; ii < k; ii++) {
			a[first + ii] = temp[ii];
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 1, 5, 8, 4, 9, 2 };
		int[] temp = new int[arr.length];
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		merge_sort(arr, 0, arr.length - 1, temp);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
