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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
    ListNode ans = new ListNode(0), tmp1 = l1, tmp2 = l2, ptr = ans;
    while (tmp1 != null && tmp2 != null) {
      int val = tmp1.val + tmp2.val + carry;
      if (val >= 10) {
        carry = 1;
      }
      else {
        carry = 0;
      }
      ListNode tmp = new ListNode(val % 10);
      ans.next = tmp;

      tmp1 = tmp1.next;
      tmp2 = tmp2.next;
      ans = ans.next;

    }

    while (tmp1 != null) {
      int val = tmp1.val + carry;
      if (val >= 10) {
        carry = 1;
      }
      else {
        carry = 0;
      }
      ListNode tmp = new ListNode(val % 10);
      ans.next = tmp;

      tmp1 = tmp1.next;
      ans = ans.next;
    }

    while (tmp2 != null) {
      int val = tmp2.val + carry;
      if (val >= 10) {
        carry = 1;
      }
      else {
        carry = 0;
      }
      ListNode tmp = new ListNode(val % 10);
      ans.next = tmp;

      tmp2 = tmp2.next;
      ans = ans.next;
    }

    if (carry == 1) {
      ListNode tmp = new ListNode(1);
      ans.next = tmp;
    }

    return ptr.next;
    }
}
