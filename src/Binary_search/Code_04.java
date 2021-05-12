package Binary_search;

/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
//间接二分
public class Code_04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            int length = ints.length;
            boolean ans = binary_search(0, length - 1, ints, target);
            if (ans) return true;
        }
        return false;

    }
    public boolean binary_search(int left, int right, int[] nums, int target) {
        if (left > right || target < nums[left] || target > nums[right]) {
            return false;
        }
        int middle = (right + left + 1) / 2;
        if (nums[middle] == target)
            return true;
        else if (nums[middle] < target)
            return binary_search(left, middle - 1, nums, target);
        else return binary_search(middle + 1, right, nums, target);
    }
}
