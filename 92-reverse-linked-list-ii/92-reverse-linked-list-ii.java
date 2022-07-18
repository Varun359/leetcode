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
    public ListNode reverse(ListNode begin,ListNode end)
    {
        ListNode prev = null;
      
        while(begin!= end)
        {
            ListNode temp = begin.next;
            begin.next = prev;
            prev = begin;
            begin = temp;
        }
        
        return prev;
       
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null)
            return head;
        if(left == right)
            return head;
        ListNode prev = null;
        ListNode next = null;
        
        ListNode begin = head;
        int i=1;
        while(i<left)
        {
            //System.out.println("Hey 1");
            prev = begin;
            begin = begin.next;
            i++;
        }
        //System.out.println(begin.val);
        ListNode end = begin;
        while(i!=right)
        {
            end = end.next;
            i++;
        }
        next = end.next;
        
        //  while(head!=null)
        // {
        //     System.out.println(head.val);
        //     head=head.next;
        // }
        
//          System.out.println(prev.val);
//          System.out.println(begin.val);
//          System.out.println(end.val);
//          System.out.println(next.val);
        ListNode s = reverse(begin, end.next);
        if(prev == null)
            head = s;
        else
          prev.next = s;
        
        while(s.next!=null)
           s = s.next;
       
        s.next = next;
        return head;
    }
}