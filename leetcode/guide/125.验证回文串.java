package cn.guide.huiwenchuan;

/**
 * ClassName: isPalindrome
 * Description: 125.验证回文串
 * date: 2020/8/20 16:09
 *
 * @author Luo
 * @since JDK 1.8
 */
public class isPalindrome {
    public static void main(String[] args) {
        //String s = "A man, a plan, a canal: Panama";
        String s2 = "1dsfffrace a car";
        System.out.println(isPalindrome1(s2));
    }


    public static boolean isPalindrome1(String s) {
        //判断是否合法
        if (s.length()==0){
            return true;
        }
        //定义左右指针，从左右向中间移动
        int l = 0;
        int r = s.length()-1;
        while (l<r){
            if (!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }else if (!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }else {
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;

    }

}
