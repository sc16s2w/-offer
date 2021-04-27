package LinkedList;

//定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
public class Code_24 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
