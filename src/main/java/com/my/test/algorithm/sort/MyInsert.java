package com.my.test.algorithm.sort;

import com.my.test.tools.Tools;

/**
 * @author:shawn
 * @date 2020/11/26 14:15
 */
public class MyInsert {
    public static void insert(int[] array){
        for (int i = 1; i < array.length; i++) {
//inner verify ,judge every current element position
            for (int j = i ;j > 0 ; j--){
                if (array[j]<array[j-1]){
                    Tools.swap(array,j,j-1);
                }
            }
        }
        Tools.print(array);



    }

    public static void main(String[] args) {
        int[] array = {12, 23, 4, 1212, 12, 1321, 5345, 81, 123, 12, 61, 1, 23};
        insert(array);
    }

}

