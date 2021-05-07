package Other;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class Code_39 {
    public static int majorityElement(int[] nums) {
        Hashtable<Integer, Integer> store = new Hashtable<Integer, Integer>();
        int result = 0;
        for(int i = 0; i<nums.length;i++){
            if(!store.containsKey(nums[i]))
                store.put(nums[i],1);
            else store.put(nums[i], store.get(nums[i])+1);
        }
        Enumeration e = store.keys();
        while( e. hasMoreElements() ){
            int k = (int) e.nextElement();
            if(store.get(k) > nums.length/2 ){
                result =k;
                break;
            }
        }
        return result;

    }
    public static void main(String[] args){
        int[] nums = {1,2,3,2,2,2,5,4,2};
        System.out.println(majorityElement(nums));

    }
}
