package cn.guide.huiwenchuan;

/**
 * ClassName: numWays
 * Description: 剑指 Offer 10- II. 青蛙跳台阶问题
 * date: 2020/8/21 16:26
 *
 * @author Luo
 * @since JDK 1.8
 */
public class numWays {
    public static void main(String[] args) {
        System.out.println(numWays1(2));
        System.out.println(numWays1(7));
        System.out.println(numWays1(0));
        System.out.println(numWays1(44));
    }

    public static int numWays1(int n) {
        //判断n
        if (n<=0){
            return 1;
        }
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        int f1 = 1;
        int f2 = 2;
        int f3 = 0;

        for (int i = 3; i <= n; i++) {
            f3 = (f2+f1)%1000000007;
            f1=f2;
            f2=f3;
        }
        return f3;

    }

}
