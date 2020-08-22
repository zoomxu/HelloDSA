package cn.guide.huiwenchuan;

import java.util.Stack;

/**
 * ClassName: validateStackSequences
 * Description: 剑指 Offer 31. 栈的压入、弹出序列
 * date: 2020/8/22 15:52
 *
 * @author Luo
 * @since JDK 1.8
 */
public class validateStackSequences {
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] poped = {4,5,3,2,1};
        System.out.println(validateStackSequences1(pushed,poped));
    }

    public static boolean validateStackSequences1(int[] pushed, int[] popped) {
        if (pushed.length==0 || popped.length==0){
            return true;
        }

        //辅助栈
        Stack<Integer> stack = new Stack<>();
        //用于标识弹出序列的位置
        int popIndex = 0;

        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek()==popped[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }

}
