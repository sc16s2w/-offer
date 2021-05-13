package Other;

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题
 */
//可以考虑循环或者递归，循环尝试
//只要是循环，基本满足不了时间限制。
    //他妈的逼傻逼用列太多了太难排了。
public class Code_16 {
    public static double myPow(double x, int n) {
        if(x==1.00) return 1.00;
        if(x== -1.00&&n%2 == 0) return 1.00;
        if(x== -1.00&&n%2 == -1) return -1.00;
        if(n >= 0){
            double result = x;
            if(n==0) return 1.0;
            if(n==1) return result;
            while(n>1){
                if(result == 0) return result;
                result=result*x;
                n--;
            }
            return result;
        }
        else{
            double result = x;
            while(n<=0){
                if(result == 0) return result;
                result=result/x;
                n++;
            }
            return result;
        }
    }
    public static void main(String[] args){
        System.out.println( myPow_2nd(2.00000, -2));
    }
    public static double myPow_2nd(double x, int n){
        long b = Math.abs(n);
        if(n>=0) return helper(x,b);
        else return 1/helper(x,b);
    }
    public static double helper(double x, long b) {
        if(b == 0) return 1.00;
        else if(b== 1) return x;
        else{
            return x* helper(x,b-1);
        }


    }
}
