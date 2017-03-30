package com.legolas.sorts;

/**
 * Created with IntelliJ IDEA.
 * User: Legolas
 * Date: 2016/9/9 0009
 * Time: 15:33
 */

/**
 * 插入排序思想：
 * 确定第一个元素，从第二个元素开始，每一趟从后往前依次与已排好的元素比较，
 * 若后面的元素比前面大，则将后面元素与前面对换。
 * i:已经确定的有序元素个数
 * j:第i+1个元素，与前面i个元素进行比较
 * 时间复杂度：O(n^2）
 */
public class InsertSort {
    public static void insertSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
    }
}
