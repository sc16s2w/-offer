package Bit_operation;

import java.util.HashMap;
import java.util.Map;

/**
 * 在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
 */
//有位运算的办法，实在是有点难想，所以主要做的方法是hashmap
public class Code_56_b {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> store = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (store.containsKey(nums[i])) {
                store.put(nums[i], store.get(nums[i]) + 1);
            } else
                store.put(nums[i], 1);
        }
        int result = 0;
        for (Integer key : store.keySet()) {
            if (store.get(key) == 1)
                result = key;
        }
        return result;
    }
}
