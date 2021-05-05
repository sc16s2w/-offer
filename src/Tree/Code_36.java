package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }
    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向
 */
//利用先序遍历把他弄成queue,然后进站调整，日妈发现不符合规定。
public class Code_36 {
    Queue<Integer> sort = new LinkedList<Integer>();
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        Onorder(root);
        Node head = new Node();
        Node prev = new Node(sort.poll());
        head.right = prev;
        Node cur;
        while (!sort.isEmpty()) {
            cur = new Node(sort.poll());
            prev.right = cur;
            cur.left = prev;
            prev = cur;
        }
        prev.right = head.right;
        head.right.left = prev;
        return head.right;
    }

    public void Onorder(Node root) {
        if (root == null) return;
        Onorder(root.left);
        sort.add(root.val);
        Onorder(root.right);
    }
    Node prev;
    Node head;
    public Node treeToDoublyList_2nd(Node root) {
        if(root == null) return null;
        Onorder_2nd(root);
        head.left = prev;
        prev.right = head;
        return head;

    }
    public void Onorder_2nd(Node root) {
        if (root == null) return;
        Onorder_2nd(root.left);
        if(prev != null) prev.right = root;
        else head = root;
        root.left = prev;
        prev = root;
        Onorder_2nd(root.right);
    }
}
