package com.my.test.algorithm.sort;

import com.my.test.tools.Tools;

/**
 * @author:shawn.wu6688@gmail.com
 * @date 2020/9/1 16:33
 */
public class Shell {
    /**
     * 从内层循环开始思考
     * 间隔比较大的时候挪动的次数比较小，间隔比较小的时候挪动的间隔比较小，大体上把数据变得有序
     */
    public static void sort(int[] arr){

        /**
         * 先进行插入排序
         * 改造插入排序为shell排序
         */
        int gap = 0;
        for (gap = arr.length >>1; gap >0; gap/=2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j > gap - 1 ; j-=gap) {
                    if (arr[j]< arr[j-gap]) {
                        Tools.swap(arr,j,j-gap);
                    }
                }
            }
        }
    }
}
