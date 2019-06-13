package sort;

import java.util.Arrays;

/**
 * 选择排序
 * 选择出数组中的最小元素，将它与数组的第一个元素交换位置。再从剩下的元素中选择出最小的元素，将它与数组的第二个元素交换位置。不断进行这样的操作，直到将整个数组排序。
 */
public class SelectionSort implements Sort {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex=i;
            for (int j = i; j < array.length; j++) {
                if(array[minIndex]>array[j]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                swap(array,i,minIndex);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 6, 8, 2, 7, 9, 8, 4};
        new SelectionSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
