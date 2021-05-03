package Tree;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 */
public class Code_54 {
    Set<Integer> set = new TreeSet<Integer>();
    public int kthLargest(TreeNode root, int k) {
        int result = 0;
        preOrderRecursion(root);
        int counter =set.size();
        for(int i:set){
            if(counter == k){
                result = i;
            }
            counter -=1;
        }
        return result;
    }
    public void preOrderRecursion(TreeNode node){
        if(node==null)
            return;
        set.add(node.val);
        preOrderRecursion(node.left);//访问左孩子
        preOrderRecursion(node.right);//访问右孩子
    }
    //巧妙解法
    //易得二叉搜索树的 中序遍历倒序 为 递减序列 。
    //中序遍历倒叙
    int result;
    int k;
    public int kthLargest_2nd(TreeNode root, int k) {
        this.k = k;
        onOrderRecursion(root);
        return result;
    }
    public void onOrderRecursion(TreeNode node){
        if(node==null)
            return;
        onOrderRecursion(node.right);//访问左孩子
        k = k-1;
        if(k == 0) result = node.val;
        onOrderRecursion(node.left);//访问右孩子
    }
}
