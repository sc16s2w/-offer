package Other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
 */
public class Code_49 {
    public static int nthUglyNumber(int n) {
        List<Integer> store = new ArrayList<>();
        store.add(1);
        for(int i = 1;i<n+1;i++){
            int temp = i*2;
            if(!store.contains(temp)) store.add(i*2);
            temp = 3*i;
            if(!store.contains(temp)) store.add(temp);
            temp = 5*i;
            if(!store.contains(temp)) store.add(i*5);
        }
        Collections.sort(store);
        for(int i = 0;i<store.size();i++){
            if(store.get(i)%7 == 0) store.remove(i);
        }
        for(int i =0;i<store.size();i++)
            System.out.println(store.get(i));
        return store.get(n-1);
    }
    public static void main(String[] args){
        int n = 13;
        System.out.println(nthUglyNumber(29));
    }
}
