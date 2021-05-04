package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 */
//先序遍历，半懂不懂的
public class Code_34 {
    LinkedList<Integer> search = new LinkedList<Integer>();
    List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
       onOrder(root,target);
       return result;
    }
    public void onOrder(TreeNode root, int target){
        if(root == null) return;
        search.add(root.val);
        target -= root.val;
        if(target == 0&&root.left == null&&root.right == null){
            result.add(new LinkedList(search));
        }
        onOrder(root.left,target);
        onOrder(root.right,target);
        search.removeLast();
    }
}
