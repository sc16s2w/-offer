package LinkedList;

import java.util.HashSet;


public class Code_52 {
    //用hash表来存储
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        ListNode result = null;
        HashSet<ListNode> storeA = new HashSet<>();
        while(p1!=null){
            storeA.add(p1);
            p1 = p1.next;
        }
        while(p2!=null){
            if(storeA.contains(p2)){
                result = p2;
                break;
            }
            p2 = p2.next;
        }
        return result;

    }

    //用双指针遍历法, 注意用null为空。
    public Node copyRandomList_2nd(Node head) {
        if(head == null) return null;
        Node p = head;
        while(p!=null){
            Node temp = new Node(p.val);
            temp.next = p.next;
            p.next = temp;
            p = p.next.next;
        }
        p = head;
        while(p!=null){
            if(p.random != null)
                p.next.random = p.random.next;
            p = p.next.next;
        }
        Node cur = head.next;
        Node pre = head, res = head.next;
        while(cur.next != null) {
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null; // 单独处理原链表尾节点
        return res;      // 返回新链表头节点
    }
}
