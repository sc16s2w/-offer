package Tree;

public class Code_55 {
    /**
     * 输入一棵二叉树的根节点，求该树的深度。
     * 从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftlength = maxDepth(root.left)+1;
        int rightlength = maxDepth(root.right)+1;
        return Math.max(leftlength,rightlength);
    }
}
