package cn.guide.huiwenchuan;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: hanota
 * Description: 面试题 08.06.汉诺塔问题
 * date: 2020/8/21 16:47
 *
 * @author Luo
 * @since JDK 1.8
 */

/**
 分治思想： 拿只有A只有两个盘子的时候做模拟，发现步骤如下:
 第一步， 把A上面的盘子放到B
 第二步， 把A上最后一个盘子放到C
 第三步， 把B上的盘子移动到C

 推广到A上有N个盘子：
 第一步， 把A上的N - 1个盘子放到B
 第二步， 把A上的最后一个盘子放到C
 第三步， 把B上的N - 1个盘子放到C

 边界情况： 当N == 1时候， 把A移动到C
 */
public class hanota {

    public static void main(String[] args) {
        List A = new ArrayList();
        //A.add(2);
        A.add(1);
        A.add(0);

        List B = new ArrayList();
        List C = new ArrayList();

        hanota1(A,B,C);

        System.out.println(C);

    }

    public static void hanota1(List<Integer> A, List<Integer> B, List<Integer> C) {
        hano(A.size(),A,B,C);
    }

    public static void hano(int n, List<Integer> A, List<Integer> B, List<Integer> C) {
        if (n==1){
            C.add(A.remove(A.size()-1));
        }else {
            //把A借助C放到B上
            hano(n-1,A,C,B);
            C.add(A.remove(A.size()-1));
            //把B借助A放到C上
            hano(n-1,B,A,C);
        }
    }

}
