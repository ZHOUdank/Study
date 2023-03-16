package com.dank.day3;

import sun.misc.Cache;

/**
 * @ClassName: cache
 * @author: zyk
 * @createTime 2023年03月16日 22:01:00
 * @Description:
 */
public class cache {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {1, 3, 2, 5, 4};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    //为啥都是红色的



}
