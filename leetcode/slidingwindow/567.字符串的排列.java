package cn.slidingwindow;

import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.HashMap;
import java.util.Objects;

/**
 * ClassName: Solution_2
 * Description: 567. 字符串的排列
 * date: 2020/8/17 21:38
 *
 * @author Luo
 * @since JDK 1.8
 */
public class Solution_2 {
    public static void main(String[] args) {
        String s1 = "ab";
        String  s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            need.put(s1.charAt(i), need.getOrDefault(s1.charAt(i),0) + 1);
        }
        int left = 0;
        int right = 0;
        int valid = 0;

        while (right<s2.length()){
            //即将进入窗口的字符
            char c = s2.charAt(right);
            right++;

            if (need.containsKey(c)){

                window.put(c,window.getOrDefault(c,0)+1);

                if (Objects.equals(window.get(c),need.get(c))){
                    valid++;
                }
            }

            //检查是否需要缩小窗口
            while (right-left>=s1.length()){
                if (valid==need.size()){
                    return true;
                }
                //即将离开窗口的字符
                char d = s2.charAt(left);
                left++;

                //进行窗口内的一系列更新
                if (need.containsKey(d)){
                    if (Objects.equals(window.get(d),need.get(d))){
                        valid--;
                    }
                    window.put(d,window.get(d)-1);
                }
            }

        }

        return false;

    }
}
