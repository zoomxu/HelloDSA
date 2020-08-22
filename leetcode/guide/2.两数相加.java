package cn.guide.huiwenchuan;

import java.util.Stack;

/**
 * ClassName: addTwoNumbers
 * Description: 2.两数相加
 * date: 2020/8/20 22:39
 *
 * @author Luo
 * @since JDK 1.8
 */
public class addTwoNumbers {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);


        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(3);

        /*ListNode cur = head;
        while (cur !=null){
            System.out.println(cur.val);
            cur=cur.next;
        }*/

        ListNode head2 = new ListNode(0);
        head2.next = new ListNode(5);
        head2.next.next = new ListNode(6);
        head2.next.next.next = new ListNode(4);

        ListNode listNode = addTwoNumbers1(head.next, head2.next);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode=listNode.next;
        }


    }

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        //记录进位数
        int carry = 0;
        while (p!=null || q!=null){
            int x = p!=null ? p.val:0;
            int y = q!=null ? q.val:0;
            int sum = x+y+carry;
            carry = sum / 10;
            curr.next = new ListNode(sum%10);
            curr=curr.next;

            //更新 p q, 同时考虑避免空指针
            if (p!=null){
                p=p.next;
            }
            if (q!=null){
                q=q.next;
            }

        }
        //处理最后的进位
        if (carry>0){
            curr.next=new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
    }

}
