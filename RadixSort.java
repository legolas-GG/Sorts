package com.legolas.sorts;

/**
 * Created with IntelliJ IDEA.
 * User: Legolas
 * Date: 2016/9/20 0020
 * Time: 14:39
 */

/**
 * 基数排序：从低位到高位依次比较各个位(或者从高位到低位（可控）)
 */
public class RadixSort {
    public static void radixSort(int[] arr , int max){
        int k = 0;
        int n = 1;
        int m = 1;//控制键值排序依据在哪一位（这里表示从个位开始排序）
        //数组的第一维表示可能的余数0-9
        int[][] temp = new int[10][arr.length];
        //数组order[i]用来表示该位是（lsd）的数的个数
        int[] order = new int[10];//默认值为0
        while(m <= max){

            //分配过程
            for(int i=0;i<arr.length;i++){
                int lsd = (arr[i]/n)%10;//个位、十位、百位……
                temp[lsd][order[lsd]] = arr[i];
                order[lsd]++;
            }

            for(int i=0;i<10;i++){
                if(order[i]!=0)
                    for(int j=0;j<order[i];j++){
                        arr[k] = temp[i][j];
                        k++;
                    }
                    order[i] = 0;//将数组按该位排序之后置order[i]为0初始值
                }
                n *= 10;
                k = 0;
                m++;
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
                System.out.print(",");
            }
            System.out.println();
            }
        }

    public static void main(String[] args) {
        int[] arr = { 73, 22, 93, 43, 55, 14, 28, 65, 39, 810 };
        radixSort(arr, 3);
    }

    }
