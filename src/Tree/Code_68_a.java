package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * 二叉搜素树的定义：若任意节点的左子树不空，则左子树上所有节点的值均小于它的根节点的值；
 * 若任意节点的右子树不空，则右子树上所有节点的值均大于它的根节点的值；
 * 任意节点的左、右子树也分别为二叉查找树；
 */
//解题思路，利用二叉搜索树找路。
public class Code_68_a {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> route1 = get_path(root,p);
        ArrayList<TreeNode> route2 = get_path(root,q);
        TreeNode result = null;
        for(TreeNode i: route1){
            if(route2.contains(i))
                result = i;
        }
        return result;
    }
    public ArrayList get_path(TreeNode root,TreeNode p){
        ArrayList<TreeNode> route1 = new ArrayList<TreeNode>();
        while(root!=p){
            if(p.val<root.val){
                route1.add(root);
                root = root.left;
            }
            else{
                route1.add(root);
                root = root.right;
            }
        }
        route1.add(root);
        return route1;

    }
}
