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

}
