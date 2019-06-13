package sort;

import java.util.Arrays;

public class MergeSort implements Sort {

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 6, 8, 2, 7, 9, 8, 4};
        new MergeSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Override
    public void sort(int[] array) {
        sort(array, 0, array.length - 1, new int[array.length]);
    }

    public void sort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid, temp);// 排序左子序列
            sort(arr, mid + 1, right, temp);// 排序右子序列
            merge(arr, left, mid, right, temp);// 合并左右子序列
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;// 左子序列指针
        int j = mid + 1;// 右子序列指针
        int k = 0;// temp指针
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            }
            if (arr[i] > arr[j]) {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        k = 0;
        while (left <= right) {
            arr[left++] = temp[k++];
        }
    }

}
