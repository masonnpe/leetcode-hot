package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class A347 {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        topKFrequent(nums,2).forEach(System.out::println);
    }
}