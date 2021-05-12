package Tree;

import java.util.*;

public class Code_26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null || B == null) return false;
        Queue<TreeNode> store = new LinkedList<TreeNode>();
        store.add(A);
        while(!store.isEmpty()){
            TreeNode temp = store.poll();
            if(temp.val == B.val){
                if(judge(temp, B)){
                    return true;
                }
            }
            if(temp.left != null) store.add(temp.left);
            if(temp.right != null) store.add(temp.right);
        }
        return false;
    }
    public boolean judge(TreeNode temp, TreeNode B){
        Queue<TreeNode> store1 = new LinkedList<TreeNode>();
        Queue<TreeNode> store2 = new LinkedList<TreeNode>();
        store1.add(temp);
        store2.add(B);
        while(!store2.isEmpty()){
            TreeNode temp1 = store1.poll();
            TreeNode temp2 = store2.poll();
            if(temp1 == null || temp1.val != temp2.val){
                return false;
            }
            if(temp2.left != null){
                store1.add(temp1.left);
                store2.add(temp2.left);
            }
            if(temp2.right != null){
                store1.add(temp1.right);
                store2.add(temp2.right);
            }
        }
        return true;
    }
}
