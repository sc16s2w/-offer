package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 */
///第一种办法没想出来咋个用不一样的结构存数判断是否一样
public class Code_28 {
    public boolean isSymmetric(TreeNode root) {
        List<Integer> store1 = new ArrayList<Integer>();
        List<Integer> store2 = new ArrayList<Integer>();
        TreeNode mirror = mirrorTree(root);
        Onorder(root,store1);
        Onorder(mirror,store2);
        return store1.equals(store2);

    }
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;
    }
    public void Onorder(TreeNode root, List<Integer> store){
        if(root == null) return;
        store.add(root.val);
        Onorder(root.left,store);
        Onorder(root.right,store);
    }
    //第二个办法递归看一不一样
    public boolean isSymmetric_2nd(TreeNode root) {
        if(root == null) return true;
        return recur(root.left, root.right);
    }
    public boolean recur(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null ||left.val != right.val) return false;
        else return recur(left.left,right.right) && recur(left.right,right.left);
    }
}
