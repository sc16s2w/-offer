package Other;

import java.util.*;

/**
 * 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
 */
public class Code_49 {
    public static int nthUglyNumber(int n) {
        TreeSet<Integer> store = new TreeSet<Integer>();
        store.add(1);
        int m = 1;
        while(m!=3*n){
            store.add((int) Math.pow(2,m));
            store.add((int) Math.pow(3,m));
            store.add((int) Math.pow(5,m));
            store.add((int) Math.pow(2,m)*(int) Math.pow(3,m));
            store.add((int) Math.pow(2,m)*(int) Math.pow(5,m));
            store.add((int) Math.pow(3,m)*(int) Math.pow(5,m));
            m++;
        }
        System.out.println(store);
        return 2;
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(nthUglyNumber(29));
    }
}
