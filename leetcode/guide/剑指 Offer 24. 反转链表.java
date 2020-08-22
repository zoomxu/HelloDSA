package cn.guide.huiwenchuan;

/**
 * ClassName: ReverseList
 * Description: 剑指 Offer 24. 反转链表
 * date: 2020/8/21 10:43
 *
 * @author Luo
 * @since JDK 1.8
 */
public class ReverseList {

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
        new ReverseList().ReverseList1(a);
        while (e != null) {
            System.out.println(e.val);
            e = e.next; }

    }
    //指针反转
    public ListNode ReverseList1(ListNode head) {
        ListNode pre = null;
        //保存结点
        ListNode q = null;

        while (head!=null){
            q = head.next;

            head.next=pre;
            pre=head;

            head=q;
        }
        return pre;
    }


    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        } }
}
