package Bit_operation;

public class Code_65 {
    public static int add(int a, int b) {
        int carry = 1;
        int sum = 0;
        while(carry!=0){
            sum = a^b;
            carry = (a&b)<<1;
            a = sum;
            b = carry;
        }
        return sum;
    }
    public static void main(String[] args){ ;
        System.out.println(add(100,22));
    }
}
