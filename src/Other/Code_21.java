package Other;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 */
public class Code_21 {
    //如果不用辅助数组，用我之前想出来的首尾指针，然后对数组元素进行交换。
    public int[] exchange(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0, j = nums.length - 1;
        while (i < j) {
            for (int m = 0; m < nums.length; m++) {
                if (nums[m] % 2 == 0) {
                    result[j] = nums[m];
                    j--;
                } else {
                    result[i] = nums[m];
                    i++;
                }
            }
        }
        return result;
    }
}
