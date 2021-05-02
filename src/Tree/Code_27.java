package Tree;

import java.util.Stack;

/**
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 */
//解题思路 递归
public class Code_27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;
    }
    //还可以用堆栈处理，时间复杂度和空间复杂度一样O(N)
    public TreeNode mirrorTree_2nd(TreeNode root) {
        if(root == null) return null;
        Stack<TreeNode> store = new Stack<TreeNode>(){{ add(root); }};
        while(!store.empty()){
            TreeNode node = store.pop();
            if(node.left != null) store.add(node.left);
            if(node.right != null) store.add(node.right);
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        return root;
    }

}
