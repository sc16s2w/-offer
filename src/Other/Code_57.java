package Other;

/**
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即
 */
//双指针法应用
public class Code_57 {
    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int i = 0;
        int j = nums.length-1;
        while(sum != target){
            sum = nums[i]+nums[j];
            if(sum<target) i++;
            else if(sum>target) j--;
            else break;
        }
        int[] twosums = {nums[i],nums[j]};
        return twosums;
    }
    public static void main(String[] args){
        int[] hh = {14,15,16,22,53,60};
        int target = 76;
        int[] h = twoSum(hh,target);
        System.out.println(h[0]);
        System.out.println(h[1]);
    }

}
