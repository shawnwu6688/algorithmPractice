package com.my.test.algorithm.sort;
import com.my.test.tools.Tools;


/**
 * @author:shawn.wu6688@gmail.com
 * @date 2020/8/28 18:09
 */
public class Bubble {
    /**
     * 1.keep bubbling and keep biggest bubble at the end of array
     *
     */
    public static void bubble(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j + 1])
                    Tools.swap(arr,j+1,j );
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            System.out.println("git hello");
        }

    }
    public static void optimizatedBubble(int[] arr) {
        /**
         * 1.add maxPos and minPos
         * 2.cut first loop half
         * 3.先从内层循环分析，确定单次算法正确，外层循环最大作用就是确定循环次数
         *   可以先把内层循环封装在方法中，然后寻找外层循环次数与内层循环的关系
         *   把固定的功能分解到方法里
         */

        for (int i = 0; i < arr.length/2 -1; i++) {
            int minPos = i;
            int maxPos = arr.length - 1;
            for (int j = i; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j + 1])
                    Tools.swap(arr,j+1,j );

            }
            for (int j = i; j < arr.length - i -1; j++) {
                if (arr[j] < arr[j + 1])
                    Tools.swap(arr,j+1,j );

            }

        }
        Tools.print(arr);

    }

    public static void optimizatedBubble1(int[] arr) {
        /**
         * 根据封装好的方法，确定内部循环
         */

        for (int i = 0; i < arr.length; i++) {
            Tools.findMax(arr,arr.length- i-1);
        }
        Tools.print(arr);

    }
    public static void optimizatedBubble2(int[] arr) {
        /**
         * 根据封装好的方法，确定内部循环
         */

        for (int i = 0; i < arr.length/2+1; i++) {
            Tools.findMax(arr,arr.length- i-1,i);
        }
        Tools.print(arr);

    }
    public static void optimizatedbubble3(int[] arr) {
        /**
         * 外层循环的优化，可以适用一部分算法的外层循环的优化
         * 内层循环，记住每一次遍历的最后一个发生交换的位置，最后一次交换位置之后都是排好序，不需要再交换的
         * 在冒泡算法这里，是只要满足所有的轻泡泡都在重泡泡之上，那么都就不会发生swap，这样再往下外层循环就不需要在继续遍历了
         */
        int flag = 0,lastExchange = 0;
        int i = 0 ,k = arr.length - i -1;
        for (i = 0; i < arr.length; i++) {

            for (int j = 0; j < k; j++) {
                if (arr[j] > arr[j + 1])
                    Tools.swap(arr,j+1,j );
                    flag = 1;
                //运行到这里，发生了交换，则还要继续发生循环
                lastExchange = j;
                //以最后一次发生交换的位置为坐标，收紧需要交换的位置
            }
         k = lastExchange;
            if (flag == 0){
                return;
            }
        }
        Tools.print(arr);

    }
}
