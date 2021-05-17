package Other;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 */
//主要是hashset去重那里。好用。每一层都有一个hashset就比较有利。
public class Code_38 {
    public static String[] permutation(String s) {
        ArrayList<Character> store = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        for(char temp:s.toCharArray())
            store.add(temp);
        helper(store, result,"");
        return (String[]) result.toArray(new String[0]);
    }
    public static void helper(ArrayList<Character> store, ArrayList<String> result, String path){
        if(store.size()==0){
            result.add(path);
            return;
        }
        HashSet<Character> visted = new HashSet<>();
        for(int i =0;i<store.size();i++){
            if(!visted.contains(store.get(i))){
                System.out.println(store.get(i)+" "+i +" " +visted.toString());
                visted.add(store.get(i));
                ArrayList<Character> temp = new ArrayList<>(store);
                String pick = path+ store.get(i);
                temp.remove(i);
                helper(temp,result,pick);
            }
        }
    }
    public static void main(String[]args){
        String[] result = permutation("aac");
        for(String s:result){
            System.out.println(s);
        }
    }
}
