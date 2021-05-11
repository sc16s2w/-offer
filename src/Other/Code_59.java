package Other;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 */
//滑动窗口
public class Code_59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return new int[0];
        }
        ArrayList<Integer> store = new ArrayList<Integer>();
        for(int i =0, j = k-1; j<nums.length;){
            int[] temp = new int[k];
            for(int m = i;m<=j;m++)
                temp[m-i] = nums[m];
            Arrays.sort(temp);
            store.add(temp[k-1]);
            i++;
            j++;
        }
        int[] result = new int[store.size()];
        //arraylist强转成int数组
        result = store.stream().mapToInt(Integer::valueOf).toArray();
        return result;
    }
    public void main(String[] args){
        int[] r= maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        for(int i:r){
            System.out.println(i);
        }

    }
}
