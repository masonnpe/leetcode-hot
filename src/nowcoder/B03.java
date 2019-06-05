package nowcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 从尾到头打印链表
 */
public class B03 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode!=null){
            list.add(0,listNode.val);
            listNode=listNode.next;
        }
        return list;
    }
}
