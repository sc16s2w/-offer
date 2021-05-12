package Sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 */
//贪心策略来写比较器，找字符串的字典序一个道理
public class Code_45 {
    public String minNumber(int[] nums) {
        String[]  str = new String[nums.length];
        for(int i =0;i<nums.length;i++){
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str,(o1,o2)->(o1+o2).compareTo(o2+o1));
        return String.join("",str);
    }
    public static void main(String[] args){
        int i = Integer.parseInt("3033459");
        System.out.println(i);
    }

}
