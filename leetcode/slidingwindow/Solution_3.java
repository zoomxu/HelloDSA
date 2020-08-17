package cn.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * ClassName: Solution_3
 * Description: 438. 找到字符串中所有字母异位词
 * date: 2020/8/17 21:58
 *
 * @author Luo
 * @since JDK 1.8
 */
public class Solution_3 {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();

        int left = 0;
        int right = 0;
        int valid = 0;

        for (int i = 0; i < p.length(); i++) {
            need.put(p.charAt(i),need.getOrDefault(p.charAt(i),0)+1);
        }

        while (right<s.length()){
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if (Objects.equals(window.get(c),need.get(c))){
                    valid++;
                }
            }

            //判断是否需要收缩窗口
            while (right-left>=p.length()){

                //判断是合法的结果
                if (valid==need.size()){
                    list.add(left);
                }
                char d = s.charAt(left);
                left++;
                if (need.containsKey(d)){
                    if (Objects.equals(window.get(d),need.get(d))){
                        valid--;
                    }
                    window.put(d,window.get(d)-1);
                }
            }

        }
        return list;
    }
}
