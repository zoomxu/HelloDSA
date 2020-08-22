package cn.guide.huiwenchuan;

/**
 * ClassName: myPow
 * Description: 剑指 Offer 16. 数值的整数次方
 * date: 2020/8/22 12:34
 *
 * @author Luo
 * @since JDK 1.8
 */
public class myPow {
    public static void main(String[] args) {
        System.out.println(myPow1(2.00000, -2));
        double x = 0.0;
        System.out.println(x==0);
    }


    public static double myPow1(double x, int n) {
        if(x == 0) return 0;
        if(n == 0) return 1;
        if(n == 1) return x;
        long b = n;
        double res = 1.0;
        if (b<0){
            x = 1 / x;
            b = -b;
        }

        while (b>0){
            if ((b&1)==1){
                res *= x;
            }
            x *= x;
            b>>=1;
        }
        return res;
    }


}
