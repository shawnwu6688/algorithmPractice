package com.my.test.algorithm.sort;

import com.my.test.tools.Tools;


/**
 * @author:shawn.wu
 * @date 2020/9/1 15:25
 */
public class Insert {
    /**
     * core: 把未参与排序的数已排好序的数进行比较，互换
     * 插入排序就相当于是先把前边的排序排好了，然后后边的数与前边拍好的数依次比较，互换位置
     * @param arr
     */
    public static void sort(int[] arr){

        int i = 0;
        for(i = 1; i <arr.length; i++){
            for (int j = i; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    Tools.swap(arr,j,j-1);
                }
            }
        }
    }

}
