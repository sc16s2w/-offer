package Heap;

import java.util.Arrays;


/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
 */
//归并排序中实现逆序对
public class Code_51 {
    static int m = 0;
    public static void main(String[] args){
        int[] merge = new int[]{4,5,6,7};
//        int[] temp = merge(new int[]{1,5,7}, new int[]{2,3});
        int[] temp = sort(merge);
        for(int i:temp)
            System.out.println(i);
        System.out.println(m);
    }
    public int reversePairs(int[] nums) {
        int[] temp = sort(nums);
        return m;


    }
    public static int[]  sort(int[] arr){
        if(arr.length<2)
            return arr;
        int middle = (arr.length)/2;
        int[] left = Arrays.copyOfRange(arr,0,middle);
        int[] right = Arrays.copyOfRange(arr,middle,arr.length);
        return merge(sort(left),sort(right));

    }
    public static int[] merge(int[] left, int[] right){
        int[] result = new int[left.length+right.length];
        int i = 0;
        int temp = 0;
        int j = 0;
        while(i<left.length&&j<right.length){
            if(left[i]<=right[j]){
                result[temp]=left[i];
                temp++;
                i++;
            }
            else{
                m = m+left.length-i;
                result[temp] = right[j];
                temp++;
                j++;
            }

        }
        while (i<left.length){
            result[temp++]=left[i++];
        }
        while (j<right.length){
            result[temp++]=right[j++];
        }
        return result;
    }
    //逆序对
    //如果不考虑时间复杂度，可以递归求解
}
