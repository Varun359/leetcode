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
    public ListNode reverse(ListNode mid)
    {
        while(mid == null || mid.next == null) return mid; 
        ListNode prev = null;
        while(mid!=null)
        {
            ListNode temp = mid.next;
            mid.next = prev;
            prev = mid;
            mid = temp;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        int len =0;
        ListNode iter = head;
        while(iter!=null)
        {
            iter = iter.next;
            len++;
        }
        
        ListNode slow = head, fast = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        
        
        ListNode rev = reverse(slow);
        
       
        while(head!=null && rev!=null)
        {
            if(head.val != rev.val)
            {
               break;
            }
            head = head.next;
            rev = rev.next;
            
        }
        if(head==null || rev==null)
             return true;
        return false;
    }
}