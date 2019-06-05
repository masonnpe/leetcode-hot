package nowcoder;

/**
 * 二维数组中的查找
 */
public class B01 {

    public boolean Find(int target, int [][] array) {
        int p=array.length-1;
        int q=array[0].length-1;
        int i=p;
        int j=0;
        while (i>=0&&j<=q){
            int current=array[i][j];
            if(current<target){
                j++;
            }else if (current>target){
                i--;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
