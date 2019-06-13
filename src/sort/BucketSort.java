package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 桶排序
 * 桶排序将[0,1)区间划分为n个相同的大小的子区间，这些子区间被称为桶。然后将n个输入元素分别放入各自的桶中。因为输入时均匀独立的，所以一般不会有很多数同时落在一个桶中的情况。这样，我们想对各个桶中的数据进行排序，然后遍历每个桶，按照次序把各个桶中的元素列出来
 */
public class BucketSort implements Sort {
    public void sort(int[] array){
        // 确定桶的个数n
        int n = array.length;
        List<ArrayList<Integer>> Blist = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            Blist.add(new ArrayList<Integer>());
        }
        // 确定元素的最值
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int a : array){
            max = Math.max(max, a);
            min = Math.min(min, a);
        }
        // 把每个元素放入桶的编号并放进去
        for(int i : array){
            int len = array.length;
            // 确定桶的编号
            int index = (int)((i-min) / (max-min+1.0) * array.length);
            // 放入对应的桶中
            Blist.get(index).add(i);
        }
        // 桶内排序
        for(int i = 0; i < Blist.size(); i++){
            Collections.sort(Blist.get(i));
        }
        // 合并数据
        int j = 0;
        for(ArrayList<Integer> arr : Blist){
            for(int i : arr){
                array[j++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 6, 8, 2, 7, 9, 8, 4};
        new BucketSort().sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
