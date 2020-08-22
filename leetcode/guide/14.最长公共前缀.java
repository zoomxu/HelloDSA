package cn.guide.huiwenchuan;

import java.util.Arrays;

/**
 * ClassName: longestCommonPre
 * Description: 14.最长公共前缀
 * date: 2020/8/20 15:09
 *
 * @author Luo
 * @since JDK 1.8
 */
public class longestCommonPre {
    public static void main(String[] args) {
        //String[] strs = {"flower","flow","flight"};
//        String[] strs = { "customer", "car", null };//空串
//        String[] strs = {};//空串
        String[] strs = null;//空串
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        //检查是否合法
        if (!checkStrs(strs)){
            return "";
        }
        //数组长度
        int length = strs.length;
        //保存结果
        StringBuilder result = new StringBuilder();
        //排序好之后，只需要比较第一个字符串和最后一个字符串
        Arrays.sort(strs);
        //找出需要比较的最小次数，即两者之中较短的那个长度
        int m = strs[0].length();
        int n = strs[length-1].length();
        int num = Math.min(m,n);

        for (int i = 0; i < num; i++) {
            if (strs[0].charAt(i) == strs[length-1].charAt(i)){
                result.append(strs[0].charAt(i));
            }else {
                break;
            }
        }
        return result.toString();

    }

    public static boolean checkStrs(String[] strs) {
        boolean flag = false;
        if (strs!=null){
            for (int i = 0; i < strs.length; i++) {
                if (strs[i] != null && strs[i].length()!=0){
                    flag=true;
                }else {
                    flag=false;
                    break;
                }
            }

        }
        return flag;
    }
}
