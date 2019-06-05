package nowcoder;

/**
 * 跳台阶
 */
public class B08 {

    public int JumpFloor(int target) {
        if(target==1){
            return 1;
        }else if(target==2){
            return 2;
        }else{
            return JumpFloor(target-2)+JumpFloor(target-1);
        }
    }
}
