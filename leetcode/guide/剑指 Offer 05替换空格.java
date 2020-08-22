package cn.guide.huiwenchuan;

/**
 * ClassName: replaceSpace
 * Description: 剑指 Offer 05替换空格
 * date: 2020/8/22 09:23
 *
 * @author Luo
 * @since JDK 1.8
 */
public class replaceSpace {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace1(s));
        System.out.println(replaceSpace2(s));
    }

    public static String replaceSpace1(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(" ")){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(String.valueOf(s.charAt(i)));
            }

        }
        return stringBuilder.toString();
    }

    public static String replaceSpace2(String s) {
        return s.replaceAll(" ","%20");
    }

}
