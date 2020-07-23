package com.qili.array;

/**
 * ð������
 */
public class BubArray {
    // ����
    private long[] arr;

    // ��������Ч���ݵĴ�С
    private int elems;

    //Ĭ�Ϲ��캯��
    public BubArray() {
        arr = new long[50];
    }

    public BubArray(int max) {
        arr = new long[max];
    }

    // ��������
    public void insert(long value) {
        arr[elems] = value;
        elems++;
    }

    // ��ʾ����
    public void display() {
        for (int i = 0; i < elems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // ð������
    public void bubbleSort() {
        long tmp = 0L;
        for (int i = 0; i < elems - 1; i++) {//������
            for (int j = 0; j < elems - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void sort(){
        long temp=0;
    }

    public static void main(String[] args) {
        BubArray barr = new BubArray();
        barr.insert(3);
        barr.insert(5);
        barr.insert(6);
        barr.insert(8);
        barr.insert(1);
        barr.insert(12);
        barr.bubbleSort();
        barr.display();
    }
}
