package Stack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class MaxQueue {
    Queue<Integer> store;
    public MaxQueue() {
        store = new LinkedList<Integer>();
    }

    public int max_value() {
        if(store.isEmpty()) return -1;
        else return Collections.max(store);

    }

    public void push_back(int value) {
        store.add(value);
    }

    public int pop_front() {
        if(!store.isEmpty()){
            int pop = store.poll();
            return pop;
        }
        else return -1;
    }

}

public class Code_59_b {
    public static void main(String[] args){
        MaxQueue obj = new MaxQueue();
        obj.push_back(3);
        obj.push_back(5);
        int param_1 = obj.max_value();
        System.out.println(param_1);
        System.out.println(obj.pop_front());
        int param_3 = obj.pop_front();
        System.out.println(param_3);
    }
        }
