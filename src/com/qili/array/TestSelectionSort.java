package com.qili.array;

/**
 * @Date: 2020/7/23
 * @Author: wuyong
 * @Description: ≤‚ ‘—°‘Ò≈≈–Ú
 */
public class TestSelectionSort {

    public  static int[]  selectionSort(int[] array){
        if (array.length==0){
            return  array;
        }

        for (int i = 0; i < array.length; i++) {
            int minIndex=i;
            for (int j = i; j < array.length; j++) {
                if (array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            int temp=array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
        return  array;
    }


}
