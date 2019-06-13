package famous;

import java.util.ArrayList;
import java.util.List;

/**
 *



 - 从头到尾彻底理解KMP: https://blog.csdn.net/v_july_v/article/details/7041827
 - 如何更好的理解和掌握 KMP 算法?: https://www.zhihu.com/question/21923021
 - KMP 算法详细解析:  https://blog.sengxian.com/algorithms/kmp



 */
public class KMP {


    private static int[] calculateMaxMatchLengths(String pattern) {
        int[] maxMatchLengths = new int[pattern.length()];
        int maxLength = 0;
        for (int i = 1; i < pattern.length(); i++) {
            while (maxLength > 0 && pattern.charAt(maxLength) != pattern.charAt(i)) {
                maxLength = maxMatchLengths[maxLength - 1]; // ①
            }
            if (pattern.charAt(i) == pattern.charAt(maxLength)) {
                maxLength++; // ②
            }
            maxMatchLengths[i] = maxLength;
        }
        return maxMatchLengths;
    }
    private static List<Integer> search(String text, String pattern) {
        List<Integer> positions = new ArrayList<>();
        int[] maxMatchLengths = calculateMaxMatchLengths(pattern);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            while (count > 0 && pattern.charAt(count) != text.charAt(i)) {
                count = maxMatchLengths[count - 1];
            }
            if (pattern.charAt(count) == text.charAt(i)) {
                count++;
            }
            if (count == pattern.length()) {
                positions.add(i - pattern.length() + 1);
                count = maxMatchLengths[count - 1];
            }
        }
        return positions;
    }

    public static void main(String[] args) {
        List<Integer> search = search("afbcdeafa", "af");
        for (int i = 0; i < search.size(); i++) {
            System.out.println(search.get(i));
        }
    }

}

