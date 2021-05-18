package Binary_search;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 *
 */
public class Code_11 {
    //目前想的办法是直接输出最小值
    //二分应该是在查找有序数组，只要右边比中间大，那右边一定是有序数组
    public static int minArray(int[] numbers) {
        int i = 0;
        int j = numbers.length-1;
        while(i<j){
            int middle = (i+j)/2;
            if(numbers[middle]<numbers[j]){
                j = middle;
            }
            else if(numbers[middle]>numbers[j]){
                i = middle+1;
            }
            else{
                j--;
            }
        }
        return numbers[i];
    }
    public static void main(String[] args){
        System.out.println(minArray(new int[]{3,4,5,1,2}));
    }
}
