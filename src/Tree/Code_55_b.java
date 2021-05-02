package Tree;

/**
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
 * 如果某二叉树中任意节点的左右子树的深度相差不超过1，
 * 那么它就是一棵平衡二叉树。
 */

//解题思路，引入了-1这个想法，只要不是length>1的全部是-1，然后如果是平衡的，每次深度+1
public class Code_55_b {
    public boolean isBalanced(TreeNode root) {
        return tree_difference(root) != -1;

    }

    public int tree_difference(TreeNode root){
        int result;
        if(root == null){
            return 0;
        }
        int leftnode = tree_difference(root.left);
        if(leftnode == -1) return -1;
        int rightnode = tree_difference(root.right);
        if(rightnode == -1) return -1;
        return result =((Math.abs(leftnode - rightnode)>1)?-1:Math
                .max(leftnode,rightnode)+1);
    }
}
