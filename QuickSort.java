package com.legolas.sorts;

/**
 * Created with IntelliJ IDEA.
 * User: Legolas
 * Date: 2016/9/9 0009
 * Time: 15:50
 */

/**
 * 快速排序思想：
 * 1.首先找一个基准值key，使用l , h两个指针分别从两边进行扫描，把比key小的和比key大的元素分开
 * 2.将高位元素同key比较，若比key小，将该元素放到低位上，并将低位l++;否则高位h--
 * 3.将低位元素同key比较，若比key大，将该元素放到高位上，并将高位h--;否则低位l++
 * 4.为第一趟排序结果左右两边进行递归
 * 时间复杂度：nlog2(n)
 */

public class QuickSort {
    public static void quickSort(int[] arr , int low , int high){
        int l = low;
        int h = high;
        int key = arr[low]; //低位标记为key
        System.out.println("low:"+l+" high:"+h);

        while(l < h){
            while(l < h && arr[h] > key){//若高位大于key,则一直向l靠近，寻找比key小的元素（找到或到达l为止）
                h--;
            }
            arr[l] = arr[h];    //找到则将该元素放到低位
            while(l < h && arr[l] < key){//若低位小于key,则一直向h靠近，寻找比key大的元素（找到或到达h为止）
                l++;
            }
            arr[h] = arr[l];  //找到则将该元素放到高位
        }
        arr[l] = key; //将key放在最终的中间位置

        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]);
            System.out.print(",");
        }

        if(h<high){
            quickSort(arr,l+1,high);
        }
        if(l>low) {
            quickSort(arr, low, h-1);
        }


    }

    public static void main(String[] args) {
        int[] arr = {5,7,6,8,4,1,9,3};
        quickSort(arr,0,arr.length-1);
    }
}
