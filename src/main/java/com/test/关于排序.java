package com.test;

import static com.sun.deploy.net.MessageHeader.merge;

public class 关于排序 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        mergeSort(arr, 0, arr.length - 1);

        bubbleSort(arr);
        System.out.println("冒泡排序:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        insertSort(arr);
        System.out.println("插入排序:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        selectSort(arr);
        System.out.println("选择排序:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("归并排序:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    //插入排序
    public static void insertSort(int[] arr) {
        int len = arr.length;
        //从第二个数开始
        for (int i = 1; i < len; i++) {
            //将当前数与前面的数比较
            int temp = arr[i];
            //如果当前数比前面的数小
            int j = i;
            //将前面的数后移
            while (j > 0 && arr[j - 1] > temp) {
                //将前面的数后移
                arr[j] = arr[j - 1];
                //将j向前移动
                j--;
            }
            //将当前数放到正确的位置
            arr[j] = temp;
        }
    }
    //选择排序
    public static void selectSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    //归并排序
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int m = 0; m < temp.length; m++) {
            arr[left + m] = temp[m];
            }
        }
    }

