package Other;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，
 * A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 */
public class Code_61 {
    public static void main(String[] args){
       int[] nums = new int[]{0,0,2,2,5};
       System.out.println(isStraight(nums));
    }
    public static boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zerocount = 0;
        int div = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == 0){
                zerocount++;
            }
            else{
                if(nums[i] == nums[i+1]) return false;
                if((nums[i]+1) != nums[i+1]){
                    div= div+nums[i+1]-nums[i]-1;
                }
                System.out.println(div);
                System.out.println(zerocount);
            }
        }
        return zerocount>=div;

    }
}
