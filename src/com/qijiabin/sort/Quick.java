package com.qijiabin.sort;

/**
 * ========================================================
 * 日 期：2016年8月9日 下午4:26:03
 * 作 者：jackson
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
public class Quick {
	
	private static void quickSort(int a[], int l, int r) {
	     if (l >= r) {
	    	 return;
	     }

	     int i = l; int j = r; int key = a[l];//选择第一个数为key
	     
	     while(i < j) {

	         while(i < j && a[j] >= key) {//从右向左找第一个小于key的值
	             j--;
	         }
	         if(i < j){
	             a[i] = a[j];
	             i++;
	         }

	         while(i < j && a[i] < key) {//从左向右找第一个大于key的值
	             i++;
	         }

	         if(i < j) {
	             a[j] = a[i];
	             j--;
	         }
	     }
	     a[i] = key;
	     quickSort(a, l, i-1);//递归调用
	     quickSort(a, i+1, r);//递归调用
	 }

	public static void main(String[] args) {
		int[] arr = new int[] {3, 1, 5, 8, 4, 9, 2};
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		quickSort(arr, 0, arr.length-1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
}
