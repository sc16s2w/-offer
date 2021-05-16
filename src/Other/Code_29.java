package Other;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 */
//一个长方形套一个长方形，把她们想成有上下左右的那种长方形。
public class Code_29 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[0];
        int left=0, top = 0;
        int right = matrix[0].length-1,down = matrix.length-1;
        ArrayList<Integer> store = new ArrayList<Integer>();
        while(top<=down&&left<=right){
            if(store.size() == matrix[0].length*matrix.length) break;
            for(int i = left;i<=right;i++) {
                store.add(matrix[top][i]);
            }
            if(store.size() == matrix[0].length*matrix.length) break;
            top++;
            for(int i =top;i<=down;i++)
                store.add(matrix[i][right]);
            if(store.size() == matrix[0].length*matrix.length) break;
            right--;
            for(int i =right;i>=left;i--)
                store.add(matrix[down][i]);
            if(store.size() == matrix[0].length*matrix.length) break;
            down--;
            for(int i = down;i>=top;i--)
                store.add(matrix[i][left]);
            if(store.size() == matrix[0].length*matrix.length) break;
            left++;
        }
        int[] intArr = store.stream().mapToInt(Integer::intValue).toArray();
        return intArr;

    }
}
