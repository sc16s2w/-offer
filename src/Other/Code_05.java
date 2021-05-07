package Other;

public class Code_05 {
    public static String replaceSpace(String s) {
       s.replaceAll(" ","%20");
       return s;

    }
    public static void main(String[] args){
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }
}
