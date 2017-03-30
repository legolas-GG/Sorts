package com.legolas.sorts;

/**
 * Created with IntelliJ IDEA.
 * User: Legolas
 * Date: 2016/9/9 0009
 * Time: 9:49
 */

/**
 * 冒泡排序思想：
 * 每次从前arr.length-i-1个元素中找到一个最大的元素放到末尾
 * i:已经寻找的趟数，（即已经放好的大元素个数）
 * j:每趟还需比较的元素个数
 * 时间复杂度：O(n^2)
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){//循环趟数
            for(int j=0;j<arr.length-i-1;j++){//每次比较的数组位置
                int temp = arr[j];
                if(arr[j]>arr[j+1]){
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
