package LinkedList;

import java.util.HashMap;
import java.util.HashSet;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

/**
 * 请实现 copyRandomList 函数，复制一个复杂链表。
 * 在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，
 * 还有一个 random 指针指向链表中的任意节点或者 null。
 */
public class Code_35 {
    //用hashmap两次遍历实现
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> store = new HashMap<Node,Node>();
        Node p = head;
        while(p!=null){
            Node cur = new Node(p.val);
            store.put(p,cur);
            p = p.next;
        }
        p = head;
        while(p!=null){
            store.get(p).next = store.get(p.next);
            store.get(p).random = store.get(p.random);
            p = p.next;
        }
        return store.get(head);
    }
    //将空间复杂度降为o(1)，使用拼接和拆分链表的办法
    public Node copyRandomList_2nd(Node head) {
        Node p = head;
        while(p!=null){
            Node temp = new Node(p.val);
            temp.next = p.next;
            p.next = temp;
            p = p.next.next;
        }
        p = head;
        while(p!=null){
            p.next.random = p.random.next;
            p = p.next.next;
        }
        p = head;
        Node p1 = head.next;
        while(p1!=null){
            p1.next = p1.next.next;
            p1 = p1.next;
        }
        return p1;
    }
}
