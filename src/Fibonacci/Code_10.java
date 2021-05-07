package Fibonacci;

/**
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）
 */
public class Code_10 {
    //普通递归会超时
    public static int fib(int n) {
        int result;
        if(n == 0) result = 0;
        else result = 1;
        if(n>2){
            result = fib(n-1)+fib(n-2);
        }
        return result;
    }
    public static void main(String[] args){
        int n = 3;
        fib(3);
    }
}
