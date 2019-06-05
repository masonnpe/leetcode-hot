package leetcode;

import java.util.ArrayList;
import java.util.List;

public class A763 {

    public List<Integer> partitionLabels(String S) {
        int i=0;
        int j=S.length()-1;
        List<Integer> indexList=new ArrayList<>();
        while (i<j){
            if(S.charAt(i)==S.charAt(j)){
                indexList.add(j);
                i=j++;
                j=S.length()-1;
            }
        }

        return null;
    }

}
