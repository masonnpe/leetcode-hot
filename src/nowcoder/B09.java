package nowcoder;

/**
 * 变态跳台阶
 */
public class B09 {
    /**
     * 两个数列做差
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        if(target==1){
            return 1;
        }else if(target==2){
            return 2;
        }else {
            return 2*JumpFloorII(target-1);
        }
    }
}
