package Other;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 约瑟夫环问题
 */
public class Code_62 {
    //用双端队列 很好理解，但他妈的傻逼超时了，目前没想到优化方法
    public static int lastRemaining(int n, int m) {
            Queue<Integer> store = new LinkedList<Integer>();
            for(int i =0; i<n;i++)
                store.add(i);
            while(store.size()!=1){
                for(int i = 0;i<m-1;i++)
                    store.add(store.remove());
                store.remove();
            }
        return store.peek();
    }
    public static void main(String[] args){
        int n = 70866;
        int m = 116922;
        System.out.println(lastRemaining(n,m));
    }
    //用了递归的思想
    public int lastRemaining_2nd(int n, int m) {
        return f(n, m);
    }

    public int f(int n, int m) {
        if (n == 1) {
            return 0;
        }
        int x = f(n - 1, m);
        return (m + x) % n;
    }
}
