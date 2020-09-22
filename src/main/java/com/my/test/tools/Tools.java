package com.my.test.tools;

import java.util.Random;

/**
 * @author:shawn.wu6688@gmail.com
 * @date 2020/8/28 17:58
 */
public class Tools {

    public static void exchangePos(int[] arr,int i,int j){

    }

    public static void findMax(int[] arr,int n,int a){
        /**
         * 冒泡算法思路找到数组最大值，并且放在n的位置
         * 冒泡算法思路找到数组最小值，并且放在a的位置
         */
        for (int j = 0; j < n; j++) {
            if (arr[j] > arr[j + 1]){
                Tools.swap(arr,j,j+1);
            }
            if (arr[j] < arr[j + 1]){
                Tools.swap(arr,j,j+1);
            }

        }
    }
    public static void findMax(int[] arr,int n){
        /**
         * 冒泡算法思路找到数组最大值，并且放在n的位置
         * 冒泡算法思路找到数组最小值，并且放在a的位置
         */
        for (int j = 0; j < n; j++) {
            if (arr[j] > arr[j + 1]){
                Tools.swap(arr,j,j+1);
            }

        }
    }

    public static void print(int[] arr){
        /**
         * 打印数组
         */
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println(" ");
    }
    public static void swap(int[] arr,int i,int j){
        /**
         * 互换位置
         */
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static int[] createRandomArray(){
        /**
         * print ramdon array
         */
        int[] arr = new int[1000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        return arr;
    }
}
