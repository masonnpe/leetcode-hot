package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 不断左右交换
 */
public class BubbleSort implements Sort{

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            boolean hasSwap=false;
            for (int j = 0; j < array.length-1; j++) {
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                    hasSwap=true;
                }
            }
            if(!hasSwap){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 6, 8, 2, 7, 9, 8, 4};
        new BubbleSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
