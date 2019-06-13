package sort;

/**
 * 计数排序
 * 计数排序的基本思想：对于一个输入数组中的一个元素x，只要知道了这个数组中比x小的元素的个数，那么我们就可以直接把x放到（x+1）的位置上。
 */
public class CountSort {

    public static void sort(int[] A , int k){//k 元素分布区间 max-0+1
        int[] count=new int[k];
        for (int i:A){
            count[i]++;
        }
        for (int i = 1; i < k; i++) {
            count[i]=count[i]+count[i-1];//计算各个数之前元素的总和
        }
        int[] B=new int[A.length];// 存放排序后的元素
        for (int i = A.length-1; i >= 0; i--) {
            B[count[A[i]]-1]=A[i];
            count[A[i]]--;
        }
        System.arraycopy(B,0,A,0,A.length);
    }

}