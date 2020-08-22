package cn.guide.huiwenchuan;

/**
 * ClassName: mergeTwoLists
 * Description: 剑指 Offer 25. 合并两个排序的链表
 * date: 2020/8/21 15:47
 *
 * @author Luo
 * @since JDK 1.8
 */
public class mergeTwoLists {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(4);

        a.next = b;
        b.next = c;


        ListNode a2 = new ListNode(1);
        ListNode b2 = new ListNode(3);
        ListNode c2 = new ListNode(4);

        a2.next = b2;
        b2.next = c2;

        ListNode head = mergeTwoLists1(a,a2);
        while (head!=null){
            System.out.println(head.val);
            head=head.next;
        }

    }

    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        //伪节点
        ListNode dummyNode = new ListNode(0);
        ListNode cur = dummyNode;

        while (l1!=null && l2!=null){
            if (l1.val<l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur=cur.next;
        }

        cur.next = (l1==null) ? l2 : l1;
        return dummyNode.next;

    }

    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
}
