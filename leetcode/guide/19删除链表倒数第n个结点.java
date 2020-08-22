package cn.guide.huiwenchuan;

/**
 * ClassName: removeNthFromEnd
 * Description: 19删除链表倒数第n个结点
 * date: 2020/8/21 14:51
 *
 * @author Luo
 * @since JDK 1.8
 */
public class removeNthFromEnd {
    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);

        a.next = b;

        ListNode head = removeNthFromEnd1(a,1);
        while (head!=null){
            System.out.println(head.val);
            head=head.next;
        }

    }

    public static ListNode removeNthFromEnd1(ListNode head, int n) {
        //需要增加头结点，如果删除第一个结点的话!
        ListNode dummyNode = new ListNode(0);
        dummyNode.next=head;
        if (n<1){
            return null;
        }
        //辅助指针
        //latter最终指向待删除的结点前一个结点
        ListNode former = dummyNode;
        ListNode latter = dummyNode;


        for (int i = 0; i < n; i++) {
            //根据实际代码逻辑，former走到最后的时候，分析，看k是不是不合理（大于链表长度）
            if (former==null){
                return null;
            }
            former = former.next;
        }

        while (former.next!=null){
            former=former.next;
            latter=latter.next;
        }

        //此时latter指向待删除的结点前一个结点
        latter.next = latter.next.next;

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
