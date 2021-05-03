package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
 */
//队列是用linked list 实现的。，然后对这种情况的判断while条件可以是队列是否为空
public class Code_32 {
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        Queue<TreeNode> store = new LinkedList<TreeNode>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        TreeNode temp = root;
        store.add(temp);
        while(!store.isEmpty()){
            temp = store.poll();
            result.add(temp.val);
            if(temp.left != null) store.add(temp.left);
            if(temp.right != null) store.add(temp.right);
        }
        int[] hh = new int[result.size()];
        for(int i = 0;i < result.size(); i ++){
            hh[i] = result.get(i);
        }
        return hh;

    }
}
