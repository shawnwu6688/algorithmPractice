package com.my.test.algorithm.sort;

import com.my.test.tools.Tools;

/**
 * @author:shawn
 * @date 2020/11/26 15:44
 */
public class MyBubble {
    public static void bubble(int [] array){
        //core thought: biggest bubble at the end of array
        //inner layout
        /**
         * core: 两两比较，把最大的放在队尾，且排除出排序
         */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -i -1; j++) {
                if (array[j]>array[j+1]){
                    Tools.swap(array,j,j+1);
                }
            }
        }
    }
    public static void optimizationBubble(int [] array){
        //core thought: biggest bubble at the end of array
        //inner layout
        for (int i = 0; i < array.length/2 +1; i++) {
            for (int j = i; j < array.length -i -1; j++) {
                if (array[j]>array[j+1]){
                    Tools.swap(array,j,j+1);
                }
            }
            for (int j = i; j < array.length -i -1; j++) {

                if (array[j+1]<array[j]){
                    Tools.swap(array,j,j+1);
                }
            }

        }


    }
}
