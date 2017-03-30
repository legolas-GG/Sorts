package com.legolas.sorts;

/**
 * Created with IntelliJ IDEA.
 * User: Legolas
 * Date: 2016/9/20 0020
 * Time: 17:02
 */

/**
 * 希尔排序：先将整个待排元素序列分割成若干个子序列分别进行直接插入排序，
 * 然后一次缩减增量再进行排序；
 * 第一次 gap = 10 / 2 = 5
 * 第二次 gap = 5 / 2 = 2
 *  ……
 */
public class ShellSort {
    public static void shellSort(int[] arr){
    int d = arr.length;
        while(true){
            d = d/2;
            for(int i=0;i<arr.length;i++){
                for(int j=i;j+d<arr.length;j++){
                    int temp;
                    if(arr[j]>arr[j+d]){
                        temp = arr[j];
                        arr[j] = arr[j+d];
                        arr[j+d] = temp;
                    }
                }
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
                System.out.print(",");
            }
            System.out.println();
            if(d==1) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,45,353,653,234,3,42,2,54,64,65,45,2342,34};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
        System.out.println();
        shellSort(arr);
    }
}
