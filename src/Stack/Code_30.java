package Stack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

class MinStack {
    LinkedList<Integer> store;
    public MinStack() {
        store = new LinkedList<Integer>();
    }

    public void push(int x) {
        store.add(x);

    }

    public void pop() {
        store.removeLast();

    }

    public int top() {
        int i = store.getLast();
        return i;
    }

    public int min() {
        Integer min = Collections.min(store);
        return min;

    }

}
