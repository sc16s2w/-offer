package Other;

public class Code_66 {
    //超出时间限制了
    public int[] constructArr(int[] a) {
        int[] result = new int[a.length];
        for(int i = 0; i<a.length;i++){
            result[i]=1;
            for(int j = a.length-1;j>=0;j--){
                if(j == i) continue;
                else result[i] = result[i]*a[j];
            }
        }
        return result;

    }
    //官方解法比较恶心的就是他用了数学知识，矩阵构造,我改来一下，利用累乘和两边的的数各组成一个数组，比较有用。
    public int[] constructArr_2nd(int[] a) {
        if(a.length == 0) return a;
        int[] left = new int[a.length];
        int[] right = new int[a.length];
        int[] result = new int[a.length];
        left[0] =1;
        right[right.length-1] = 1;
        for(int i =1;i<left.length;i++){
            left[i] = left[i-1]*a[i-1];
        }
        for(int j = right.length-2;j>=0;j--){
            right[j] = right[j+1]*a[j+1];
        }
        for(int i = 0;i<a.length;i++){
            result[i] = left[i]*right[i];
        }
        return result;
    }


}
