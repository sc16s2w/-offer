package Heap;

import java.util.Arrays;

public class Code_51 {
    public static void main(String[] args){
        int[] merge = new int[]{2,4,1,3,7,9,8};
//        int[] temp = merge(new int[]{1,5,7}, new int[]{2,3});
        int[] temp = sort(merge);
        for(int i:temp)
            System.out.println(i);
    }
    public static int[]  sort(int[] arr){
        if(arr.length<2)
            return arr;
        int middle = (arr.length)/2;
        int[] left = Arrays.copyOfRange(arr,0,middle);
        int[] right = Arrays.copyOfRange(arr,middle,arr.length);
        return merge(sort(left),sort(right));

    }
    public static int[] merge(int[] left, int[] right, int m){
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
                m = m+1
                result[temp] = right[j];
                temp++;
                j++;
            }

        }
        while (i<left.length){
            m = m+1;
            result[temp++]=left[i++];
        }
        while (j<right.length){
            m = m+1
            result[temp++]=right[j++];
        }
        return resultm;
    }
    //逆序对
    //如果不考虑时间复杂度，可以递归求解
//    public int reversePairs(int[] nums) {
//
//    }
}
