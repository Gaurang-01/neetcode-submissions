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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode l1 = head;
        ListNode l2 = slow.next;
        slow.next = null;
        ListNode curr = l2;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        l2 = prev;
        while(l2 != null && l1 != null){
            ListNode l1next = l1.next;
            ListNode l2next = l2.next;

            l1.next = l2;
            l2.next = l1next;

            l1 = l1next;
            l2 = l2next;
        }
       
    }
}
