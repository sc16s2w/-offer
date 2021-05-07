package Heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 */
public class Code_40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] result = new int[k];
        for(int i = 0;i<result.length;i++){
            result[i] =arr[i];
        }
        return result;
    }
    //用堆试了一下，可以实时维护进行优化；
    PriorityQueue<Integer> minPriorityQueue = new PriorityQueue<>(10, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    });
    public int[] getLeastNumbers_2nd(int[] arr, int k) {
        int[] result = new int[k];
        for(int i =0;i<arr.length;i++){
            minPriorityQueue.offer(arr[i]);
        }
        for(int i =0;i<arr.length;i++){
            result[i] = minPriorityQueue.poll();
        }
        return result;
    }
}
