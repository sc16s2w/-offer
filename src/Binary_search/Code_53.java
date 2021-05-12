package Binary_search;

/**
 * 统计一个数字在排序数组中出现的次数。
 */
public class Code_53 {
    public int search(int[] nums, int target) {
        return binary_search(nums, target)-binary_search(nums, target-1);

    }
    //这样为啥找到的是右边界
    public int binary_search(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        int result = -1;
        while(left<=right){
            int middle = (left+right)/2;
            if(nums[middle] <= target) left = middle+1;
            else right = middle-1;

        }
        return left;
    }
}
