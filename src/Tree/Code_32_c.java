package Tree;

import java.util.*;

/**
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 */
//对输出进行反转
public class Code_32_c {
    public List<List<Integer>> levelOrder(TreeNode root) {
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
        for (int i = 1;i<final_result.size();i+=2){
            Collections.reverse(final_result.get(i));
        }
        return final_result;

    }
    //人家的聪明办法：利用linked list进行头尾部添加
    public List<List<Integer>> levelOrder_2nd(TreeNode root) {
        Queue<TreeNode> store =  new LinkedList<TreeNode>();
        List<List<Integer>> final_result = new ArrayList<List<Integer>>();
        if(root != null) store.add(root);
        int counter = 1;
        while(!store.isEmpty()){
            LinkedList<Integer> result = new LinkedList<Integer>();
            for(int i=store.size();i>0;i--){
                TreeNode temp = store.poll();
                if(counter %2 == 0) result.addFirst(temp.val);
                if(counter %2 != 0) result.addLast(temp.val);
                if(temp.left != null) store.add(temp.left);
                if(temp.right != null) store.add(temp.right);

            }
            final_result.add(result);
            counter+=1;
        }
        return final_result;

    }
}
