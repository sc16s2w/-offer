package Bit_operation;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 */
//位运算没咋动。
//指定那一位的感觉
public class Code_56 {
    public static int[] singleNumbers(int[] nums) {
        int result = nums[0];
        for(int i = 1; i<nums.length;i++){
            result = result^nums[i];
        }
        int div = 1;
        //找哪一位不等
        while ((div & result) == 0) {
            div <<= 1;
        }
        int a = 0, b = 0;
        for(int i = 0; i<nums.length;i++) {
            if ((div & nums[i]) != 0) {
                a ^= nums[i];
            } else {
                b ^= nums[i];
            }
        }
        return new int[]{a, b};
    }
    public static void main(String[] args){
        int[] test = new int[]{4,1,4,6};
        System.out.println(singleNumbers(test)[1]);
    }

}
