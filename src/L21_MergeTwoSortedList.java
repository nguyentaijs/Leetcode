import utils.ListNode;

public class L21_MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);
        ListNode curList = preHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curList.next = l1;
                l1 = l1.next;
            } else {
                curList.next = l2;
                l2 = l2.next;
            }
            curList = curList.next;
        }
        curList.next = l1 == null ? l2 : l1;
        return preHead.next;
    }
}