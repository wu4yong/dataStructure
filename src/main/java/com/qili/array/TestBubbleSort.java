package qili.array;

/**
 * @Date: 2020/7/23
 * @Author: wuyong
 * @Description: √∞≈›≈≈–Ú≤‚ ‘
 */
public class TestBubbleSort {

    public static int[] bubbleSort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
                return array;
    }
    public static void main(String[] args) {
        int[] arr={1,4,2,3,6};
        int[] ints = bubbleSort(arr);
        for (int a: ints) {
            System.out.println(a);
        }
    }
}
