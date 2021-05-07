package Other;

/**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
 * 比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 */
//考虑大数，不知道
public class Code_17 {
    public int[] printNumbers(int n) {
        int length = (int) Math.pow(10,n);
        int[] final_result = new int[length-1];
        for(int i = 0; i<length-1;i++){
            final_result[i] = i+1;
        }
        return final_result;
    }
}
