package LinkedList;

/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 */
//如果初始化的那个节点不想要打出next就可以了，然后遍历完一个可以直接把另一个接在后面。
public class Code_25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode cur = new ListNode(0);
        ListNode result = cur;
        while(p1 != null && p2 != null){
            if(p1.val < p2.val){
                result.next = p1;
                p1 = p1.next;
            }
            else{
                result.next = p2;
                p2 = p2.next;
            }
            result = result.next;
        }
        result.next = (p1!=null)?p1:p2;
        return cur.next;

    }
}
