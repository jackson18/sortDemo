package com.qijiabin.sort;

import java.util.Arrays;

/**
 * ========================================================
 * 日 期：2016年9月18日 下午6:18:49
 * 版 本：1.0.0
 * 类说明：基数排序
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
public class Radix {
	
	public static void radixSort(int[] data, int radix, int d) {  
        // 缓存数组  
        int[] tmp = new int[data.length];  
        // buckets用于记录待排序元素的信息  
        // buckets数组定义了max-min个桶  
        int[] buckets = new int[radix];  
  
        for (int i = 0, rate = 1; i < d; i++) {  
        	
            // 重置count数组，开始统计下一个关键字  
            Arrays.fill(buckets, 0);  
            
            // 将data中的元素完全复制到tmp数组中  
            System.arraycopy(data, 0, tmp, 0, data.length);  
  
            // 计算每个待排序数据的子关键字  
            for (int j = 0; j < data.length; j++) {  
                int subKey = (tmp[j] / rate) % radix;  
                buckets[subKey]++;  
            }  
  
            for (int j = 1; j < radix; j++) {  
                buckets[j] = buckets[j] + buckets[j - 1];  
            }  
  
            // 按子关键字对指定的数据进行排序  
            for (int m = data.length - 1; m >= 0; m--) {  
                int subKey = (tmp[m] / rate) % radix;  
                data[--buckets[subKey]] = tmp[m];  
            }  
            rate *= radix;  
        }  
  
    }  

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 61, 5, 8, 4, 39, 2 };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		radixSort(arr, 10, 2);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
}
