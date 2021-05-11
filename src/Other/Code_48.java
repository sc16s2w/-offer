package Other;

import java.util.*;

/**
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 */
//双指针+hashset. 太他妈麻烦了我佛了。
public class Code_48 {
    public static int lengthOfLongestSubstring(String s) {
        if(s.equals("")) return 0;
        else if(s.length() == 1) return 1;
        char[] store = s.toCharArray();
        HashSet<Character> result = new HashSet<Character>();
        List<Integer> maxnum = new ArrayList<Integer>();
        for(int i = 0,j = 0;j<store.length; ){
            if(!result.contains(store[j])){
                result.add(store[j]);
                j++;
            }
            else{
                int max = result.size();
                maxnum.add(max);
                i++;
                j=i+1;
                result.clear();
                if(i<store.length){
                    result.add(store[i]);
                }
                else break;
            }
        }
        maxnum.add(result.size());
        if(maxnum.size()==0) return result.size();
        else return Collections.max(maxnum);
    }
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("aab"));
    }
    //人家用hashmap 来村
    public int lengthOfLongestSubstring_2nd(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int i = -1, res = 0;
        for(int j = 0; j < s.length(); j++) {
            if(dic.containsKey(s.charAt(j)))
                i = Math.max(i, dic.get(s.charAt(j))); // 更新左指针 i
            dic.put(s.charAt(j), j); // 哈希表记录
            res = Math.max(res, j - i); // 更新结果
        }
        return res;
    }
}

