package com.legolas.sorts;

/**
 * Created with IntelliJ IDEA.
 * User: Legolas
 * Date: 2016/9/9 0009
 * Time: 10:58
 */

/**
 * 选择排序思想：（相当于用k去不断捕捉比i小的元素，并不断与之替换）
 * 每次假设当前元素为最小，将最小元素依次同该位置之后所有元素比较，
 * 若存在更小的则记录更小的元素位置，与当前最小元素交换，直到找到最小元素。
 *
 * 不稳定：举个例子，序列5 8 5 2 9，我们知道第一遍选择第1个元素5会和2交换，
 * 那么原序列中2和5的相对前后顺序就被破坏了
 * 时间复杂度：O(n^2）
 */
public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int k=i;//记录当前元素位置
            for(int j=i;j<arr.length-1;j++){
                if(arr[k]>arr[j+1]){
                    k=j+1;//若存在更小，记录更小元素位置
                }
            }
            if(k!=i){//若更小元素与当前位置不一致，则交换
                int temp =arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
    }
}
