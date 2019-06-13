package search;

/**
 * 二分查找
 */
public class BinarySearch {

    private static int search(int[] arr, int p, int q, int target) {
        if (p < q) {
            int mid = (p + q) / 2;
            if (arr[mid] > target) {
                return search(arr, p, mid - 1, target);
            } else if (arr[mid] == target) {
                return mid;
            } else {
                return search(arr, mid + 1, q, target);
            }
        }
        return -1;
    }

    private static int search(int[] arr, int target) {
        int p = 0;
        int q = arr.length - 1;
        while (p < q) {
            int mid = (p + q) / 2;
            if (arr[mid] > target) {
                q = mid - 1;
            } else if (arr[mid] == target) {
                return mid;
            } else {
                p = mid + 1;
            }
        }
        return -1;
    }
}
