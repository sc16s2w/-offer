package Other;

/**
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，
 * 11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，
 * 用来计算一个数字有多少种不同的翻译方法。
 */
//注意题目描述，看看有没有0
public class Code_46 {
    public int translateNum(int num) {
        char[] result = String.valueOf(num).toCharArray();
        return helper(result,0);
    }
    public int helper(char[] result, int index){
        if(index == result.length)
            return 1;
        if(result[index] == '1'){
            int res = helper(result,index+1);
            if(index+1<result.length) res =res+helper(result,index+2);
            return res;
        }
        if(result[index] == '2'){
            int res = helper(result,index+1);
            if(index+1<result.length&&result[index+1]<'6'&&result[index+1]>='0') res =res+helper(result,index+2);
            return res;
        }
        return helper(result,index+1);
    }
}
