package com.my.test.algorithm.sort;

import org.junit.Test;

public class Selection {
    /**
    author:wuxiao
     */
    /**
     * 选择排序
     */


    public static void selectSort(int[] arr){
        /**
         * 时间复杂度上的两处优化
         * 1、在比较最小值放在数组前端的基础上，同时比较最大值，放在数组末端
         * 2、在一次比较一个的基础上比较两个
         * 这样就减少了便利的次数
         */


        for(int i = 0; i<(arr.length)/2+1; i++){

            int minPos = i;
            int maxPos = arr.length-i-1;
            for (int j = i+1; j<arr.length-i; j++){
                minPos = arr[minPos]>arr[j]?j:minPos;
                maxPos = arr[maxPos]<arr[j]?j:maxPos;
            }
            System.out.println("minPos:"+minPos);
            System.out.println("maxPos:"+maxPos);
            swap(arr,minPos,i);
            swap(arr,maxPos,arr.length-i-1);
            System.out.println("经过第"+i+"次遍历后的数组：");
            print(arr);
        }
        //for(int i = 0; i<(arr.length); i++){
        //    int minPos = i;
        //    int maxPos = arr.length-i-1;
        //    for (int j = i+1; j<arr.length-i-1; j+=2){
        //        minPos = arr[minPos]>(arr[j]>arr[j+1]?arr[j+1]:arr[j])?j:minPos;
        //
        //    }
        //    System.out.println("minPos:"+minPos);
        //
        //    swap(arr,minPos,i);
        //
        //    System.out.println("经过第"+i+"次遍历后的数组：");
        //    print(arr);
        //}
    }
    public static void print(int[] arr){
        /**
         * 打印数组
         */
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println("");
    }
    public static void swap(int[] arr,int i,int j){
        /**
         * 互换位置
         */
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
