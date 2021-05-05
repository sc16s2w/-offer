package Stack;


import java.util.Stack;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 */
//主要是头部删除整数，用两个stack用来把他反一转。
class CQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public CQueue() {
        st1 = new Stack<Integer>();
        st2 = new Stack<Integer>();
    }

    public void appendTail(int value) {
        st1.push(value);
    }

    public int deleteHead() {
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                int i = st1.pop();
                st2.push(i);
            }
        }
        if(st2.isEmpty()){
            return -1;
        }
        else{
            int j = st2.pop();
            return j;
        }
    }
}