package Other;

/**
 * 数字以0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，等等。
 * 请写一个函数，求任意第n位对应的数字。
 */
public class Code_44 {
    //一层套一层十分难以分析。。找某个数具体的位数主要靠转成字符串数组来找。然后主要算位数和数数。
    public static int findNthDigit(int n) {
        if(n<10) return n;
        int m= 0;
        while(n>=index_judge(m)){
            n-=index_judge(m);
            m++;
        }
        int i = n%(m+1);
        int j = (int) (Math.pow(10,m)+n/(m+1));
        if(i== 0){
            String s = String.valueOf(j-1);
            String result = String.valueOf(s.charAt(s.length()-1));
            return Integer.parseInt(result);
        }
        else{
            String s = String.valueOf(j);
            String result = String.valueOf(s.charAt(i-1));
            return Integer.parseInt(result);}


    }
    public static int index_judge(int n){
        return (int) (Math.pow(10,n)*9*(n+1));
    }
}
