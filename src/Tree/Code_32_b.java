package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 * 打印成多层列表
 * 我想的办法是，在无法确定层数的时候，加入一个0指针，不能用null，因为题目中会给到null指针，然后注意加入0指针的时机和弹出。
 */
public class Code_32_b {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> store =  new LinkedList<TreeNode>();
        store.add(root);
        TreeNode mark = new TreeNode(0);
        store.add(mark);
        List<List<Integer>> final_result = new ArrayList<List<Integer>>();
        List<Integer> result = new ArrayList<Integer>();
        while(!store.isEmpty()){
            TreeNode temp = store.poll();
            if(temp == mark){
                if(store.isEmpty()) break;
                final_result.add(result);
                result = new ArrayList<Integer>();
                store.add(mark);
                continue;
            }
            if(temp!=null && temp != mark){
                result.add(temp.val);
                store.add(temp.left);
                store.add(temp.right);
            }
        }
        return final_result;

    }
    //官方做法，利用queue的size来加一个个列表
    public List<List<Integer>> levelOrder_2nd(TreeNode root) {
        Queue<TreeNode> store =  new LinkedList<TreeNode>();
        List<List<Integer>> final_result = new ArrayList<List<Integer>>();
        if(root != null) store.add(root);
        while(!store.isEmpty()){
            List<Integer> result = new ArrayList<Integer>();
            for(int i=store.size();i>0;i--){
                TreeNode temp = store.poll();
                result.add(temp.val);
                if(temp.left != null) store.add(temp.left);
                if(temp.right != null) store.add(temp.right);

            }
            final_result.add(result);
        }
        return final_result;

    }
}
