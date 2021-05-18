package Fibonacci;

/**
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */
//当写下青蛙跳台阶的过程可以发现，其基本等同于斐波拉契数列,迭代搞不了的时候存一下。
public class Code_10_b {
    public int numWays(int n) {
        if(n==0) return 1;
        if(n==1) return 1;
        if(n==2) return 2;
        else{
            int result = 0;
            int temp_1 = 1;
            int temp_2 = 2;
            for(int i = 3; i<=n;i++){
                result = (int) ((temp_1+temp_2)%(1e9+7));
                temp_1 = temp_2;
                temp_2 = result;
            }
            return result;
        }
    }
}
