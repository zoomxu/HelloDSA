package cn.guide.huiwenchuan;

import java.util.Stack;

/**
 * ClassName: CQueue
 * Description: 剑指 Offer 09. 用两个栈实现队列
 * date: 2020/8/22 15:03
 *
 * @author Luo
 * @since JDK 1.8
 */
public class CQueue {
    public static void main(String[] args) {
        int value=3;
        CQueue obj = new CQueue();
        obj.appendTail(value);
        int param_2 = obj.deleteHead();

    }
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack1.isEmpty() && stack2.isEmpty()){
            return -1;
        }
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
