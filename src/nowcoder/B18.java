package nowcoder;

/**
 * 二叉树的镜像
 */
public class B18 {
    public void Mirror(TreeNode root) {
        if (root == null)
            return;
        swap(root);
        Mirror(root.left);
        Mirror(root.right);
    }

    private void swap(TreeNode root) {
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
    }
}
