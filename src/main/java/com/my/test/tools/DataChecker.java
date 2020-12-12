package com.my.test.tools;


import com.my.test.algorithm.sort.Shell;
import org.junit.Test;
import java.util.Arrays;
import java.util.Random;

/**
 * @author:shawn.wu
 * @date 2020/8/28 17:08
 */
public class DataChecker {
    /**
     * 1.generate random array
     * 2.compare your algorithm with deterministic algorithm like systom algorithm
     * 3.Multiple verification
     * @return
     */

    static int[] generateRandomArray(){
        int[] arr = new int[10];
        Random r = new Random();
        for(int i = 0;i<arr.length;i++){
            arr[i] = r.nextInt();
        }
        return arr;
    }
    @Test
    public void check(){
        int[] arr = generateRandomArray();
        int[] arr1 = new int[arr.length];
        System.arraycopy(arr,0,arr1,0,arr.length);
        Arrays.sort(arr);
        /**
         * 自己写的排序算法
         */
        Shell.sort(arr1);
        Tools.print(arr1);
        boolean same = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr[i] != arr1[i])
                same = false;
        }
        Tools.print(arr);
        System.out.println(same==true ? "right":"wrong");
    }

}
