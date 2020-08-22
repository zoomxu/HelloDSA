package cn.guide.huiwenchuan;

import com.sun.jmx.snmp.SnmpNull;

/**
 * ClassName: FindKthToTail
 * Description: 剑指offer22: 倒数第k个结点
 * date: 2020/8/21 14:21
 *
 * @author Luo
 * @since JDK 1.8
 */
public class FindKthToTail {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        FindKthToTail1(a,3);
    }


    public static ListNode FindKthToTail1(ListNode head, int k) {
        //判断k是否合理
        if (k<=0){
            return null;
        }
        ListNode former = head;
        ListNode latter = head;


        for (int i = 0; i < k; i++) {
            //根据实际代码逻辑，former走到最后的时候，分析，看k是不是不合理（大于链表长度）
            if (former==null){
                return null;
            }
            former=former.next;
        }
        while (former!=null){
            former=former.next;
            latter =latter.next;
        }

        System.out.println(latter.val);
        return latter;


    }


    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }


}
