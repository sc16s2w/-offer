package Other;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 *
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 */
//滑动窗口，这个应用两个指针，分为fixed 和没有fixed的窗口。
public class Code_57_b {
    public int[][] findContinuousSequence(int target) {
        List<int[]> vec = new ArrayList<int[]>();
        for(int i =1,j=2;i<j;){
            int sum = (i+j)*(j-i+1)/2;
            if(sum == target){
                int[] res = new int[j-i+1];
                for(int m = i;m<=j;++m)
                    res[m-i] = m;
                vec.add(res);
                i++;
            }
            else if(sum<target){
                j++;
            }
            else{
                i++;
            }
        }
        return vec.toArray(new int[vec.size()][]);

    }
}
