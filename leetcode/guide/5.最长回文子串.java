package cn.guide.huiwenchuan;

/**
 * ClassName: longestPalChild
 * Description: 5.最长回文子串
 * date: 2020/8/20 16:27
 *
 * @author Luo
 * @since JDK 1.8
 */
public class longestPalChild {
    private int index;
    private int len;
    public static void main(String[] args) {
        System.out.println(new longestPalChild().longestPalindrome("cbbd"));
    }
    public  String longestPalindrome(String s) {
        //判断合法否
        if (s.length()<0){
            return s;
        }
        for (int i = 0; i < s.length()-1; i++) {
            PalindromeHelper(s,i,i);
            PalindromeHelper(s, i, i+1);
        }
        return s.substring(index,index+len);
    }

    public  void PalindromeHelper(String s, int l, int r){
        while (l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        if (len<r-l-1){
            index=l+1;
            len=r-l-1;
        }
    }
}
