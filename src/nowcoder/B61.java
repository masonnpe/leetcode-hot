package nowcoder;

/**
 * 序列化二叉树?
 */
public class B61 {

    private String deserializeStr;

    String Serialize(TreeNode root) {
        if (root == null)
            return "#";
        return root.val + " " + Serialize(root.left) + " " + Serialize(root.right);
    }

    TreeNode Deserialize(String str) {
        deserializeStr = str;
        return Deserialize();
    }

    TreeNode Deserialize() {
        if (deserializeStr.length() == 0)
            return null;
        int index = deserializeStr.indexOf(" ");
        String node;
        if (index==-1){
            node=deserializeStr;
            deserializeStr="";
        }else {
            node=deserializeStr.substring(0, index);
            deserializeStr=deserializeStr.substring(index + 1);
        }
        if (node.equals("#"))
            return null;
        int val = Integer.valueOf(node);
        TreeNode t = new TreeNode(val);
        t.left = Deserialize();
        t.right = Deserialize();
        return t;
    }
}
