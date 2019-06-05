package nowcoder;

/**
 * 斐波那契数列
 */
public class B07 {
    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else {
            return Fibonacci(n-2)+Fibonacci(n-1);
        }
    }
}
