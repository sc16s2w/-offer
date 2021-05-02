package Tree;

import java.util.HashMap;

public class Code_68_b {
    HashMap<TreeNode, TreeNode> store = new HashMap<TreeNode,TreeNode>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    }
    public void preOrderRecursion(TreeNode node){
        if(node==null) //如果结点为空则返回
            return;
        store.put(node.left, node);
        store.put(node.right, node);
        preOrderRecursion(node.left);//访问左孩子
        preOrderRecursion(node.right);//访问右孩子
    }
}
