package Other;

/**
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。
 * 为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
 *
 */
//如果有两个空格，按单个空格分的话，会把另一个空格判成一个字符串，要不得。
public class Code_58 {
    public static String reverseWords(String s) {
        s = s.trim();
        String[] Array = s.split("\\s");
        String[] newarray = new String[Array.length];
        int j = Array.length-1;
        for(int i =0;i<Array.length;i++){
            newarray[j] = Array[i];
            j--;
        }
        String result = newarray[0];
        for(int i =1;i<Array.length;i++){
            if(newarray[i].equals("")) continue;
            else result=result + " "+newarray[i];
        }
        return result;
    }
    public static void main(String[]args){
        String s = "a good  example";
        String h = " dd d ";
        h = h.replace(" ", "");
        System.out.println(h);
        System.out.println(reverseWords(s));
    }
}
