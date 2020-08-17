package cn.slidingwindow;

import java.util.HashMap;

/**
 * ClassName: Solution_4
 * Description: 3. 无重复字符的最长子串
 * date: 2020/8/17 22:20
 *
 * @author Luo
 * @since JDK 1.8
 */
public class Solution_4 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));

    }
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> window = new HashMap<>();

        int right = 0;
        int left = 0;
        //存放结果
        int res = 0;

        while (right<s.length()){
            char c = s.charAt(right);
            //right-left 而不是 right-left+1 的原因
            right++;

            window.put(c,window.getOrDefault(c,0)+1);

            while (window.get(c)>1){
                char d = s.charAt(left);
                left++;
                window.put(d, window.get(d)-1);
            }
            res = Math.max(res,right-left);
        }

        return res;
    }
}
