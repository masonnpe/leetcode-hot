package nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 和为S的两个数字
 */
public class B42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = array.length - 1;
        int p = -1;
        int q = -1;
        while (i < j) {
            int iaddj = array[i] + array[j];
            if (iaddj == sum) {
                list.add(array[i]);
                list.add(array[j]);
                return list;
            } else if (iaddj < sum) {
                i++;
            } else {
                j--;
            }
        }
        return list;
    }
}
