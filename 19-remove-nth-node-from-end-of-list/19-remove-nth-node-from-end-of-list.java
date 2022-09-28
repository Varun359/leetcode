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
        ListNode start = head;
        int len  = 0;
        while(start!=null)
        {
            start = start.next;
            len++;
        }
        n = len - n;
        start = head;
        int trav = 0;
        if(n == 0)
            return start.next;
        while(trav < n-1)
        {
            start = start.next;
            trav++;
        }
        start.next = start.next.next;
        return head;
    }
}