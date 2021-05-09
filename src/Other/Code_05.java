package Other;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
//因为char的不可修改特性，新建一个合适长度的字符数组来往里面填值。
public class Code_05 {
    public static String replaceSpace(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        for (char item : arr) {
            if (item == ' ') {
                count++;
            }
        }
        char[] arr_new = new char[arr.length+count*2];
        for(int m = 0, n= 0;m<arr.length;m++,n++){
            if(arr[m]==' '){
                arr_new[n] = '%';
                arr_new[n+1] = '2';
                arr_new[n+2] = '0';
                n = n+2;
            }
            else{
                arr_new[n] = arr[m];
            }
        }
        return String.valueOf(arr_new);

    }
    public static void main(String[] args){
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }
}
