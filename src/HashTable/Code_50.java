package HashTable;

import java.util.Hashtable;

public class Code_50 {
    public static char firstUniqChar(String s) {
        char result = ' ';
        Hashtable<Character, Integer> store = new Hashtable<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!store.containsKey(ch)) {
                store.put(ch, 1);
            } else {
                store.put(ch, store.get(ch) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (store.get(ch) == 1) {
                result = ch;
                break;
            }

        }
        return result;
    }
    public static void main(String[] args){
        String s = "";
        char dd = firstUniqChar(s);
        System.out.println(dd);

    }
}
