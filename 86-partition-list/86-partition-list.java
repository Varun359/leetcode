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
    public ListNode partition(ListNode head, int x) {
       
        ListNode less = new ListNode(-1, null);
        ListNode more = new ListNode(-1, null);
        
        ListNode l = less;
        ListNode m = more;
        while(head!=null)
        {
            if(head.val<x)
            {
                l.next = new ListNode(head.val, null);
                l = l.next;
            }
            else
            {
                m.next = new ListNode(head.val, null);
                m = m.next;
            }
            head = head.next;
        }
        
        l.next = more.next;
        
        return less.next;
       
    }
}