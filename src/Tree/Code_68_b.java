package Tree;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 */
public class Code_68_b {
    //时间复杂度和空间复杂度都是O（n)，主要采取的是用哈希表存储节点和其父节点，然后hashset存储路径，
    //如果路径相同，return
    HashMap<TreeNode, TreeNode> store = new HashMap<TreeNode,TreeNode>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        preOrderRecursion(root);
        HashSet<TreeNode> road = new HashSet<>();
        HashSet<TreeNode> road2 = new HashSet<>();
        TreeNode key = p;
        while(key!=null){
            road.add(store.get(key));
            key = store.get(key);
        }
        TreeNode result = q;
        TreeNode final_result = root;
        road.add(p);
        while(result != null){
            if(road.contains(result)){
                final_result = result;
                break;
            }
            result=store.get(result);
        }
        return final_result;

    }
    public void preOrderRecursion(TreeNode node){
        if(node==null) //如果结点为空则返回
            return;
        if(node.left != null) store.put(node.left, node);
        if(node.right != null) store.put(node.right, node);
        preOrderRecursion(node.left);//访问左孩子
        preOrderRecursion(node.right);//访问右孩子
    }
    //属实递归。看到能理解，自己想不出来
    public TreeNode lowestCommonAncestor_2nd(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null||root == p||root == q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null)
            return root;
        return left!=null?left:right;

    }
}
