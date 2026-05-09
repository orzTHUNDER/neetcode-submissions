/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
    ListNode slow = head;

    while (n > 0) {
      fast = fast.next;
      n--;
    }

    if (fast == null) {
      return head.next;
    }

    while (fast != null) {
      fast = fast.next;
      if (fast == null) {
        slow.next = slow.next.next;
        break;
      }
      slow = slow.next;
    }

    return head;
    }
}
