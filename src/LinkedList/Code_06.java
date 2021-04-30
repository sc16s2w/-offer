package LinkedList;
import java.util.*;



 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }


//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
public class Code_06 {
    public int[] reversePrint(ListNode head) {
        ListNode p = head;
        Stack<Integer> st = new Stack<Integer>();
        while(p != null){
            st.push(p.val);
            p = p.next;
        }
        int[] result = new int[st.size()];
        for(int i = 0;i<result.length;i++){
            result[i] = st.pop();
        }
        return result;
    }

}
