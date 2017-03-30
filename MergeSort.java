package com.legolas.sorts;

/**
 * Created with IntelliJ IDEA.
 * User: Legolas
 * Date: 2016/9/9 0009
 * Time: 17:45
 */

/**
 * 归并排序思想：**
 *
 *
 */
public class MergeSort {
    /**
     * <pre>
     * 	二路归并
     * 	原理：将两个有序表合并和一个有序表
     * @param left 第一个有序表的起始下标
     * @param center 第二个有序表的起始下标
     * @param right 第二个有序表的结束小标
     */
    private static void merge(int[] arr, int left, int center, int right) {
        int[] tmp = new int[right - left + 1];
        int i = left, j = center, k = 0;
        while (i < center && j <= right) {
            if (arr[i] <= arr[j]) {
                tmp[k] = arr[i];
                k++;
                i++;
            } else {
                tmp[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i < center) {
            tmp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= right) {
            tmp[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(tmp, 0, arr, left, tmp.length);
    }

    /**
     * * *
     *
     * @param arr
     * @param s 左边起始位
     * @param len 每次归并的有序集合的长度
     * << n 左移位运算符等于*2^n  >> n右移位运算符等于/2^n ,但前者效率均高于后者
     */
    public static void mergeSort(int[] arr, int s, int len) {
        int size = arr.length;
        int mid = size / (len*2);    //记录数组中点位置
        int c = size % ((len*2) - 1);
        if (mid == 0) return;   //
        for (int i = 0; i < mid; ++i){
            s = i * 2 * len;
            merge(arr, s, s + len, (len*2) + s - 1);
        }

        if (c != 0){
            merge(arr, size - c - 2 * len, size - c, size - 1);
        }

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // -------递归执行下一趟归并排序------ //
        mergeSort(arr, 0, 2 * len);
    }

    public static void main(String[] args) {
        int[] a = new int[] { 4,3,6,1,12,11,2,21,18,14,17,36,29,7,16};
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        mergeSort(a, 0, 1);
    }
}
