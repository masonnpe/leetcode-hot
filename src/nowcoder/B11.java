package nowcoder;

/**
 * 二进制中1的个数
 */
public class B11 {
    /**
     * Integer.bitCount
     * @param n
     * @return
     */
    public int NumberOf1(int n) {
        int count=0;
        while (n!=0){
            count++;
            n=n&(n-1);//去掉最低位的1
        }
        return count;
    }
}
