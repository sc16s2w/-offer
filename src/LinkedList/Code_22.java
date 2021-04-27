package LinkedList;

//输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
//例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
public class Code_22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int length = 0;
        ListNode cur = head;
        ListNode prev = head;
        while(cur != null){
            length++;
            cur = cur.next;
        }
        for(int i = 0;i<length-k;i++){
            prev = prev.next;
        }
        return prev;
    }
}
