package sort;

import java.util.Arrays;

/**
 * 插入排序
 * 每次都将当前元素插入到左侧已经排序的数组中，使得插入之后左侧数组依然有序。
 */
public class InsertSort implements Sort{
    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int current=array[i];
            int j;
            for (j = i; j >0&&array[j-1]>current; j--) {
                array[j]=array[j-1];
            }
            array[j]=current;
        }

    }

    public void sort2(int[] array) {
        int i=1;
        while (i<array.length){
            int current=array[i];
            int j=i;
            while (j>0 &&array[j-1]>current){
                array[j]=array[j-1];
                j--;
            }
            array[j]=current;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 6, 8, 2, 7, 9, 8, 4};
        new InsertSort().sort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
