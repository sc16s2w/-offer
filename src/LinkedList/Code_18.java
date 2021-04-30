package LinkedList;

/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 */
//这种结构可以把之前的node在尾部的删掉
public class Code_18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode p = head;
        if(p.val == val)
            return p.next;
        while(p.next!=null&&p.next.val != val){
            p = p.next;
        }
        if(p.next !=null){
            p.next = p.next.next;
        }
        return head;
    }
}
