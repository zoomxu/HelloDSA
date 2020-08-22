package cn.guide.huiwenchuan;

import java.util.HashSet;

/**
 * ClassName: longestPalindrome
 * Description: 409.最长回文串
 * date: 2020/8/20 16:02
 *
 * @author Luo
 * @since JDK 1.8
 */
public class longestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome1(s));
    }
    public static int longestPalindrome1(String s) {
        //判断是否合法
        if (s.length()==0){
            return 0;
        }
        //HashSet辅助
        HashSet<Character> hashSet = new HashSet<>();
        //记录双数的个数
        int count = 0;
        //转换成字符数组
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!hashSet.contains(chars[i])){
                hashSet.add(chars[i]);
            }else {
                hashSet.remove(chars[i]);
                count++;
            }
        }
        return hashSet.isEmpty() ? 2*count : 2*count+1;
    }
}
