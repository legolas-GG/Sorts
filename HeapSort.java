package com.legolas.sorts;

/**
 * Created with IntelliJ IDEA.
 * User: Legolas
 * Date: 2016/9/21 0021
 * Time: 10:19
 */

/**
 * 堆排序：堆排序的过程就是首先构建大根堆，然后对顶元素（及最大元素）与最后个元素替换位置，
 * heapsize减1，重新调整堆变成大根堆。重复上面操作直到heapsize等于一的时候。排序完成
 */
public class HeapSort {
    public static void heapSort(int[] arr){
        buildHeap(arr);
        int n = arr.length;
        int i;
        //每次把堆顶元素与最后一个元素交换
        //再重新调整堆
        //直到堆只剩下一个元素，排序完成
        for(i=n-1;i>=1;i--){
            swap(arr,0,i);
            heapify(arr,0,i);

            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]);
                System.out.print(",");
            }

            System.out.println();

        }

    }

    static void buildHeap(int[] arr){
    int n = arr.length;//数组中元素个数
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,i,n);
        }
    }
    static void heapify(int[] arr,int parent,int max){
        int left = 2*parent+1;//左孩子的下标
        int right = 2*parent+2;//右孩子的下标
        int largest = 0;
        //寻找3个节点中最大值节点的下标
        if(left<max&&arr[left]>arr[right]){
            largest = left;
        }
        else if (right < max && arr[right] > arr[largest]){
            largest = right;
        }
    else{
        largest = parent;
    }
        //最大值如果不是parent，那么进行交换，并且继续调整堆
        if(largest!=parent){
            swap(arr,largest,parent);
            heapify(arr,largest,max);
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
