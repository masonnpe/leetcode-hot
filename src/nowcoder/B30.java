package nowcoder;

/**
 *	连续子数组的最大和
 */
public class B30 {
    public int FindGreatestSumOfSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int greatestSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int val : nums) {
            sum = sum <= 0 ? val : sum + val;
            greatestSum = Math.max(greatestSum, sum);
        }
        return greatestSum;
    }
}
