package nowcoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *	表示数值的字符串
 */
public class B53 {
    //?   ： 重复 0 ~ 1
    //+   ： 重复 1 ~ n
    //*   ： 重复 0 ~ n
    public boolean isNumeric(char[] str) {
        if (str == null || str.length == 0)
            return false;
        return new String(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
    }
}
